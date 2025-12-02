package com.ust.srs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ust.srs.bean.CredentialsBean;
import com.ust.srs.bean.ProfileBean;
import com.ust.srs.service.User;

public class UserDAO implements User {

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
    public String login(CredentialsBean credentialsBean) {
        // Check if the credentials match in the database
        try {
            String query = "SELECT * FROM credentials WHERE userID = ? AND password = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, credentialsBean.getUserID());
            ps.setString(2, credentialsBean.getPassword());
            rs = ps.executeQuery();

            if (rs.next()) {
                // Successful login, update the loginStatus to 1 (logged in)
                String updateQuery = "UPDATE credentials SET loginStatus = 1 WHERE userID = ?";
                ps = con.prepareStatement(updateQuery);
                ps.setString(1, credentialsBean.getUserID());
                ps.executeUpdate();
                return "Login successful! Welcome " + rs.getString("userType");
            } else {
                return "Invalid credentials";
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error during login";
        }
    }

    @Override
    public boolean logout(String userId) {
        // Set the loginStatus to 0 (logged out) for the specified user
        try {
            String query = "UPDATE credentials SET loginStatus = 0 WHERE userID = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, userId);

            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0; // Return true if the update was successful
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public String changePassword(CredentialsBean credentialsBean, String newPassword) {
        // Update the password for the user
        try {
            String query = "UPDATE credentials SET password = ? WHERE userID = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, newPassword);
            ps.setString(2, credentialsBean.getUserID());

            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                return "Password changed successfully!";
            } else {
                return "User not found";
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error changing password";
        }
    }

    @Override
    public String register(ProfileBean profileBean) {
        // Generate a new userID based on the first two letters of the first name and a random 4-digit number
        String userIDPrefix = profileBean.getFirstName().substring(0, 2).toUpperCase();
        int randomNum = (int) (Math.random() * 10000); // Random 4-digit number
        String userID = userIDPrefix + String.format("%04d", randomNum); // Combine prefix and random number

        try {
            // Check if the userID already exists
            String checkQuery = "SELECT * FROM credentials WHERE userID = ?";
            ps = con.prepareStatement(checkQuery);
            ps.setString(1, userID);
            rs = ps.executeQuery();

            // If the userID already exists, regenerate it
            while (rs.next()) {
                randomNum = (int) (Math.random() * 10000);
                userID = userIDPrefix + String.format("%04d", randomNum);
                ps.setString(1, userID);
                rs = ps.executeQuery();
            }

            // Insert into credentials table
            String credentialsQuery = "INSERT INTO credentials (userID, password, userType, loginStatus) VALUES (?, ?, ?, ?)";
            ps = con.prepareStatement(credentialsQuery);
            ps.setString(1, userID);
            ps.setString(2, profileBean.getPassword());
            ps.setString(3, "Customer"); // New users are registered as customers
            ps.setInt(4, 0); // New users are logged out by default
            ps.executeUpdate();

            // Insert into profile table
            String profileQuery = "INSERT INTO profile (userID, firstName, lastName, dateOfBirth, gender, street, location, city, state, pincode, mobileNo, emailID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            ps = con.prepareStatement(profileQuery);
            ps.setString(1, userID);
            ps.setString(2, profileBean.getFirstName());
            ps.setString(3, profileBean.getLastName());
            ps.setString(4, profileBean.getDateOfBirth());
            ps.setString(5, profileBean.getGender());
            ps.setString(6, profileBean.getStreet());
            ps.setString(7, profileBean.getLocation());
            ps.setString(8, profileBean.getCity());
            ps.setString(9, profileBean.getState());
            ps.setString(10, profileBean.getPincode());
            ps.setString(11, profileBean.getMobileNo());
            ps.setString(12, profileBean.getEmailID());
            ps.executeUpdate();

            return "Registration successful! Your userID is: " + userID;
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error during registration";
        }
    }
}

