package com.ust.srs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ust.srs.bean.CredentialsBean;
import com.ust.srs.service.Authenticate;

public class AuthenticateDAO implements Authenticate {

    public static Connection con = getCon();
    public static PreparedStatement ps;
    public static ResultSet rs;

    // Method to establish a connection to the database
    public static Connection getCon() {
        try {
            // Register MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish the connection to the database
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shipreservation", "root", "pass@word1");
        } catch (ClassNotFoundException cnf) {
            System.out.println("Database Driver not found: " + cnf);
        } catch (SQLException sql) {
            System.out.println("SQL Error: " + sql);
        }
        return con;
    }

    @Override
    public boolean authenticate(CredentialsBean credentialsBean) {
        // Authenticate the user by checking if the credentials match in the database
        boolean isAuthenticated = false;
        try {
            String query = "SELECT * FROM credentials WHERE userID = ? AND password = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, credentialsBean.getUserID());
            ps.setString(2, credentialsBean.getPassword());

            rs = ps.executeQuery();

            if (rs.next()) {
                // User found and authenticated
                isAuthenticated = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isAuthenticated;
    }

    @Override
    public String authorize(String userId) {
        // Authorize user by checking their type (Admin or Customer)
        String userType = null;
        try {
            String query = "SELECT userType FROM credentials WHERE userID = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, userId);

            rs = ps.executeQuery();
            if (rs.next()) {
                // Get the user type (Admin or Customer)
                userType = rs.getString("userType");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userType; // Returns either "Admin", "Customer" or null if user not found
    }

    @Override
    public boolean changeLoginStatus(CredentialsBean credentialsBean, int loginStatus) {
        // Update the login status for a given user (1 for logged in, 0 for logged out)
        boolean isUpdated = false;
        try {
            String query = "UPDATE credentials SET loginStatus = ? WHERE userID = ?";
            ps = con.prepareStatement(query);
            ps.setInt(1, loginStatus);
            ps.setString(2, credentialsBean.getUserID());

            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                // If the query affected any rows, then login status was updated successfully
                isUpdated = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }
}




