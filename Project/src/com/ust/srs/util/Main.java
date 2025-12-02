package com.ust.srs.util;

import com.ust.srs.bean.CredentialsBean;
import com.ust.srs.ui.Admin;
//import com.ust.srs.ui.Customer;
import com.ust.srs.ui.Login;

public class Main {
	public static void main(String[] args) {
		Login lg = new Login();
		lg.performLogin();
		
		CredentialsBean User = lg.getLoggedInUser();
		lg.setLoggedInUser(null);
			
		
		System.out.println(User);
		
		if(User.getLoginStatus() == 1) {
			if(User.getUserType().equals("Customer")) {
				System.out.println("Customer");
				
				//Customer customer = new Customer();
				//customer.customerFunctions();
				
			}
			else if(User.getUserType().equals("Admin")) {
				System.out.println("Administrator");
				Admin admin = new Admin();
				admin.adminFunctions();
				
			}
		}
	}

}
