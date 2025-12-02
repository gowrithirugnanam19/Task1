package com.ust.srs.util;

import java.util.ArrayList;
import com.ust.srs.dao.*;
import com.ust.srs.bean.*;

public class Test {
	
	public static ArrayList<ShipBean> shipbean_Arr = new ArrayList<ShipBean>();
	
	public static ArrayList<ScheduleBean> schbean_Arr = new ArrayList<ScheduleBean>();
	
	public static ArrayList<RouteBean> routebean = new ArrayList<RouteBean>();
	
	public static ArrayList<CredentialsBean> credbean = new ArrayList<CredentialsBean>();
	
	public static ArrayList<PassengerBean> passbean = new ArrayList<PassengerBean>();
	
	public static ArrayList<ProfileBean> profilebean = new ArrayList<ProfileBean>();
	
	public static 	ArrayList<ReservationBean> reservbean = new ArrayList<ReservationBean>();

	
	public void initializeData(){
		
		
		CredentialsBean cb_CC001 = new CredentialsBean("CC001", "custmr", "Customer", 0);
		credbean.add(cb_CC001);
		
		CredentialsBean admin_AA001 = new CredentialsBean("AA001", "admin", "Admin", 0);
		credbean.add(admin_AA001);
		

		PassengerBean Gowri = new PassengerBean("RESID_ADV","SCHID_ADV","Gowri",22,"Female");
		passbean.add(Gowri);
		
		
		ProfileBean pb_Gowri = new ProfileBean("UID_ADV","Gowri","Dhivya","13-11-2002","Female","Pallinda strt","tvm","kazhakoottam","kerala","686520","94534534","fasfsa@mail.com","wfasdfpass");
		profilebean.add(pb_Gowri);
		
		
		ReservationBean rb_Gowri = new ReservationBean("RESID_ADV","SCHID_ADV","UID_ADV","13-11-2023","16-11-2023",20,400, "Success");
		reservbean.add(rb_Gowri);
		
		
		RouteBean routeb_Gowri = new RouteBean("ROUTE_ID_ADV", "Tvm","Banglore","2hr",400);
		routebean.add(routeb_Gowri);
		
		
		ScheduleBean schb_Gowri = new ScheduleBean("S123","T783","R543", "11-11-2025");
		schbean_Arr.add(schb_Gowri);
		
		System.out.println("Data entered Successfully");
//		/*
//		AdministartorDAO admin = new AdministartorDAO();
//		
//		
//		
//		//Adding ships****************************************************
//		System.out.println();
//		System.out.println("Adding a ship: ");
//		ShipBean Titanic2 = new ShipBean("123", "Titanic2", 100,50);
//		ShipBean Titanic3 = new ShipBean("1223423", "Voyager", 100,50);
//		
//		admin.addShip(Titanic2);
//		admin.addShip(Titanic3);
//		
//		System.out.println(Test.shipbean_Arr);
//		//****************************************************************
//		
//		
//		//removing ships*******************************************
//		System.out.println();
//		System.out.println("Removing a ship: ");
//		
//		ArrayList<String> idtoberemoved  = new ArrayList<String>();
//		idtoberemoved.add("123");
//		
//		admin.removeShip(idtoberemoved);
//		System.out.println(Test.shipbean_Arr);
//		//*********************************************************
//		
//		
//		
//		//Modifying ship******************************************
//		System.out.println();
//		System.out.println("Modifying ship: ");
//		ShipBean Voyager2 = new ShipBean("1223423", "Voyager 2", 100,50);
//		System.out.println(admin.modifyShip(Voyager2));
//		System.out.println(Test.shipbean_Arr);
//		//**************************************************************
//		
//
//		//adding schedule*********************************
//		System.out.println();
//		System.out.println("Adding a schedule: ");
//		admin.addSchedule(schb_Advaith);
//		System.out.println(Test.schbean_Arr);
//		//************************************************
//		
//
//		//Modifying a schedule*********************************
//		System.out.println();
//		System.out.println("Modifying a schedule:");
//		
//		ScheduleBean schb_Advaith2 = new ScheduleBean("SCHID_ADV","NEW_SHIP_ID_ADV","ROUTE_ID_ADV", "13-11-2023");
//		
//		admin.modifySchedule(schb_Advaith2);
//		System.out.println(Test.schbean_Arr);
//		//************************************************
//		
//		
//		//removing schedule****************************************
//		System.out.println();
//		System.out.println("Removing schedule: ");
//		ArrayList<String> schtoberemoved = new ArrayList<String>();
//		schtoberemoved.add(schb_Advaith.getScheduleID());
//		
//		admin.removeSchedule(schtoberemoved);
//		System.out.println(Test.schbean_Arr);
//		//*********************************************************
//		
//		
//		//adding route***********************************************************************
//		System.out.println();
//		System.out.println("Adding route: ");
//		RouteBean routeb_Arul = new RouteBean("ROUTE_ID_ARUL", "Tvm","Tamil Nadu","12hr",600);
//		admin.addRoute(routeb_Arul);
//		System.out.println(Test.routebean);
//		//************************************************************************************
//		
//		//modifying route***********************************************************************		
//		System.out.println();
//		System.out.println("Modifying a route: ");
//		RouteBean routeb_Arul2 = new RouteBean("ROUTE_ID_ARUL", "Banglore","Tamil Nadu","20hr",600);
//		admin.modifyRoute(routeb_Arul2);
//		System.out.println(Test.routebean);
//		//************************************************************************************
//		
//
//		//adding schedule*********************************
//		System.out.println();
//		System.out.println("Adding a schedule: ");
//		ScheduleBean schb_arul = new ScheduleBean("SCHID_ARUL","NEW_SHIP_ID_ARUL","ROUTE_ID_ARUL", "found");
//		admin.addSchedule(schb_arul);
//		System.out.println(Test.schbean_Arr);
//		//************************************************
//		
//		
//		
//		//removing route*******************
//		System.out.println();
//		System.out.println("Removing route: ");
//		admin.removeRoute("ROUTE_ID_ADV");
//		System.out.println(Test.routebean);
//		//********************************
//		
//		
//		//finding shipbyID******************************
//		System.out.println();
//		System.out.println("Findind Ship by id: ");
//		System.out.println(admin.viewByShipId("1223423"));
//		//**************************************************
//		
//		
//		//Finding by RotueID******************************************
//		System.out.println();
//		System.out.println("Finding routes by id: ");
//		System.out.println(admin.viewByRouteId("ROUTE_ID_ARUL"));
//		//**************************************************************
//		
//		
//		//Displaying all ships******************************************
//		System.out.println();
//		System.out.println("Displaying all ships: ");
//		admin.addShip(Titanic2);
//		System.out.println(admin.viewByAllShips());
//		//**************************************************************
//		
//		
//		//Displaying all routes*****************************************
//		System.out.println();
//		System.out.println("Displaying all routes: ");
//		System.out.println(admin.viewByAllRoute());
//		//**************************************************************
//		
//
//		//Displaying all Schedules******************************************
//		System.out.println();
//		System.out.println("Displaying all schedules: ");
//		System.out.println(admin.viewByAllSchedule());
//		//**************************************************************
//		
//		//Displaying by scheduleid******************************************
//		System.out.println();
//		System.out.println("Displaying by schedule id: ");
//		System.out.println(admin.viewByScheduledId("SCHID_ADV"));
//		//**************************************************************
//		
//		
//		//Displaying passenger by scheduleid******************************
//		System.out.println();
//		System.out.println("Displaying by passenger id: ");
//		System.out.println(admin.viewPassengersByShip("SCHID_ADV"));
//		//**************************************************************
//		
//		CustomerDAO customer = new CustomerDAO();
//
//		//Viewing schedule by Route*********************************************
//		System.out.println();
//		System.out.println("Viewing schedule by route: ");
//		System.out.println(customer.viewScheduleByRoute("Banglore","Tamil Nadu","found"));
//		//******************************************************************************
//		
//		
//		//Cancel Ticket****************************************
//		System.out.println();
//		System.out.println(Test.reservbean);
//		System.out.println("Cancelling ticket: ");
//		System.out.println(customer.cancelTicket("RESID_ADV"));
//		System.out.println(Test.reservbean);
//		//******************************************************
//		
//		//reserving Ticket********************************************************************************************************
//		ReservationBean rb_test= new ReservationBean("RES456","SCHID234","UID_USER","13-11-2023","16-11-2023",20,400, "Success");
//		Test.reservbean.add(rb_test);
//		
//		//check if these passengers already exist
//		PassengerBean Alan = new PassengerBean("","","Alan",22,"Male");
//		PassengerBean Abhi = new PassengerBean("","","Abhishek",23,"Male");
//		Test.passbean.add(Abhi);
//		Test.passbean.add(Alan);
//		ArrayList<PassengerBean> passengerList = new ArrayList<PassengerBean>();
//		passengerList.add(Alan);
//		passengerList.add(Abhi);
//		
//		System.out.println();
//		System.out.println("ReservingTicket");
//		System.out.println(customer.reserveTicket(rb_test, passengerList));
//		System.out.println(Test.passbean);
//		//****************************************************************************************************************************
//		
//		//System.out.println(Test.passbean);
//		//viewingTicket*************************************
//		System.out.println();
//		System.out.println("Viewing Ticket:");
//		System.out.println(customer.viewTicket("RES456"));
//		//**************************************************
//		
//		//PrintingTicket
//		System.out.println();
//		System.out.println("Printing Ticket:");
//		System.out.println(customer.viewTicket("RES456"));*/
	}
}