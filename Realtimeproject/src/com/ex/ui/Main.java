package com.ex.ui;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;

import com.ex.bean.EmployeeBean;
import com.ex.dao.AdminDao;
public class Main {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
Class.forName("com.mysql.cj.jdbc.Driver"); //registering and loading DB server
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ustglobal","root", "pass@word1");
//System.out.println("connected successfully");
//PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?)");
//	ps.setInt(1, 101);
//	ps.setString(2,"Karthik");
//	ps.setInt(3,45000);
//int i=ps.executeUpdate();
//System.out.println(i+" record inserted successfully");

ArrayList<EmployeeBean> al=AdminDao.selectAllEmployee();
String str="";
for(EmployeeBean e:al)
{
str+=e.getId()+" "+e.getName()+" "+e.getSalary()+"\n";
}
JOptionPane.showMessageDialog(null, str);
//
//int id=Integer.parseInt(JOptionPane.showInputDialog("Enter Employye ID"));
//EmployeeBean e1=AdminDao.selectEmployeeById(id);
//JOptionPane.showMessageDialog(null, e1.getId()+" "+e1.getName()+" "+e1.getSalary());
//JOptionPane.showMessageDialog(null, AdminDao.deleteEmployee(id)+" record deleted successfully...");
//String name=JOptionPane.showInputDialog("Enter Employee Name");
//int salary=Integer.parseInt(JOptionPane.showInputDialog("Enter Salary"));
//EmployeeBean eb=new EmployeeBean();
//    eb.setId(id);
//	//eb.setName(name);
//	//eb.setSalary(salary);
//	//JOptionPane.showMessageDialog(null,AdminDao.addEmployee(eb)+" record inserted successfully");
// //JOptionPane.showMessageDialog(null,AdminDao.updateEmployee(eb)+" record updated successfully");
}
}
