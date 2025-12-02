package com.ust.srs.dao;

import com.ust.srs.util.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.ust.srs.bean.PassengerBean;
import com.ust.srs.bean.RouteBean;
import com.ust.srs.bean.ScheduleBean;
import com.ust.srs.bean.ShipBean;
import com.ust.srs.service.Administrator;

import java.util.Scanner;

public class AdministratorDAO implements Administrator{
	
	Scanner sc = new Scanner(System.in);
	
	Connection con = DB.con;
	public static PreparedStatement ps;
	public static ResultSet rs;
	

	@Override
	public String addShip(ShipBean shipbean) {
		int i = 0;
		try {
			ps = con.prepareStatement(
					"INSERT INTO SRS_TBL_Ship VALUES (?,?,?,?)"
			);
			ps.setString(1, shipbean.getShipID());
			ps.setString(2, shipbean.getShipName());
			ps.setInt(3, shipbean.getSeatingCapacity());
			ps.setInt(4, shipbean.getReservationCapacity());
			
			i  = ps.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		String result = (i == 0) ? "SUCCESS" : "FAIL";
		return result;
	}
	@Override
	public boolean modifyShip(ShipBean shipbean) {
		
		String shipId = shipbean.getShipID();
		int count = 0;
		
		for(ShipBean ship : Test.shipbean_Arr) {
			if(ship.getShipID().equals(shipId)) {
				Test.shipbean_Arr.set(count, shipbean);
				return true;
			}
			count+=1;
			
		}
		return false;
	}

	@Override
	public int removeShip(ArrayList<String> ShipId) {
		int i = 0;
		for(String id: ShipId) {
			try {
				
				ps = con.prepareStatement("DELETE FROM SRS_TBL_Ship WHERE ShipId = ?");
				ps.setString(1, id);
				i  = ps.executeUpdate();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		return i;
	}

	@Override
	public String addSchedule(ScheduleBean schedulebean) {
		String result = (Test.schbean_Arr.add(schedulebean) ? "SUCCESS" : "FAIL");
		return result;
	}

	@Override
	public boolean modifySchedule(ScheduleBean schedulebean) {
		String schId = schedulebean.getScheduleID();
		int count = 0;
		
		for(ScheduleBean schedule : Test.schbean_Arr) {
			if(schedule.getScheduleID().equals(schId)) {
				Test.schbean_Arr.set(count, schedulebean);
				return true;
			}
			count+=1;
		}
		return false;
	}

	@Override
	public int removeSchedule(ArrayList<String> scheduleid) {
		for(String schdID: scheduleid) {
			for(ScheduleBean schedule : Test.schbean_Arr) {
				if(schedule.getScheduleID().equals(schdID)) {
					Test.schbean_Arr.remove(schedule);
					return 1;
				}
			}
		}
		return 0;
	}

	@Override
	public String addRoute(RouteBean routebean) {
		String result = (Test.routebean.add(routebean)) ? "SUCCESS" : "FAIL";
		return result;
	}

	@Override
	public boolean modifyRoute(RouteBean routebean) {
		String routeId = routebean.getRouteID();
		int count = 0;
		
		for(RouteBean route: Test.routebean) {
			if(route.getRouteID().equals(routeId)) {
				Test.routebean.set(count, routebean);
				return true;
			}
			count+=1;
		}
		return false;
	}

	@Override
	public int removeRoute(String routeid) {
			for(RouteBean route: Test.routebean ) {
				if(route.getRouteID().equals(routeid)) {
					Test.routebean.remove(route);
					return 1;
			}
		}
		return 0;
	}

	@Override
	public ShipBean viewByShipId(String ShipId) {
		for(ShipBean ship : Test.shipbean_Arr) {
			if(ship.getShipID().equals(ShipId)) {
				return ship;
			}
		}
		return null;
	}
	
	

	@Override
	public RouteBean viewByRouteId(String routeid) {
		for(RouteBean route : Test.routebean) {
			if(route.getRouteID().equals(routeid)) {
				return route;
			}
		}
		return null;
	}

	
	
	@Override
	public ArrayList<ShipBean> viewByAllShips() {
		
		ArrayList<ShipBean> shipArrayList = new ArrayList<ShipBean>();
		
		for(ShipBean ship : Test.shipbean_Arr) {
			shipArrayList.add(ship);
		}
		return shipArrayList;
	}

	@Override
	public ArrayList<RouteBean> viewByAllRoute() {
		ArrayList<RouteBean> routeArrayList = new ArrayList<RouteBean>();
		
		for(RouteBean route : Test.routebean) {
			routeArrayList.add(route);
		}
		return routeArrayList;
	}

	@Override
	public ArrayList<ScheduleBean> viewByAllSchedule() {
		ArrayList<ScheduleBean> scheduleArrayList = new ArrayList<ScheduleBean>();
		
			for(ScheduleBean schedule : Test.schbean_Arr) {
				scheduleArrayList.add(schedule);
			}
			return scheduleArrayList;
		}

	@Override
	public ScheduleBean viewByScheduledId(String scheduleid) {
		for(ScheduleBean schedule : Test.schbean_Arr) {
			if(schedule.getScheduleID().equals(scheduleid)) {
				return schedule;
			}
		}
		return null;
	}

	@Override
	public ArrayList<PassengerBean> viewPassengersByShip(String scheduleid) {
		
		String shipId;
		ArrayList<PassengerBean> passengerList = new ArrayList<PassengerBean>();
		
		for(ScheduleBean schedule : Test.schbean_Arr) {
			if(schedule.getScheduleID().equals(scheduleid)) {
				shipId = schedule.getShipID();
				for (PassengerBean passenger : Test.passbean) {
					if(passenger.getScheduleID().equals(scheduleid)) {
						passengerList.add(passenger);
						
					}
				}
				
			}
		}
		return passengerList;
	}

}


//package com.ust.srs.dao;
//
//import com.ust.srs.service.Administrator;
//import com.ust.srs.bean.ShipBean;
//import com.ust.srs.bean.CredentialsBean;
//import com.ust.srs.bean.RouteBean;
//
//import java.util.ArrayList;
//import java.util.List;
//public class AdministratorDAO implements Administrator{
//	private static List<CredentialsBean> credentialsList = new ArrayList<>();
//	private List<RouteBean> routeList = new ArrayList<>();
//    public String addUser(CredentialsBean user) {
//        for (CredentialsBean uc : credentialsList) {
//            if (uc.getUserID().equals(user.getUserID())) {
//                return "FAILURE: User ID already exists.";
//            }
//        }
//        credentialsList.add(user);
//        return "SUCCESS: User added.";
//    }
//
//    public boolean authenticate(String userID, String password) {
//        for (CredentialsBean uc : credentialsList) {
//            if (uc.getUserID().equals(userID) && uc.getPassword().equals(password)) {
//                uc.setLoginStatus(0);
//                return true;
//            }
//        }
//        return false;
//    }
//
//	private static List<ShipBean> shipList = new ArrayList<>();
//
//	@Override
//	public String addShip(ShipBean shipbean) {
//		for (ShipBean ship : shipList) {
//            if (ship.getShipID().equals(shipbean.getShipID())) {
//                return "FAILURE: Ship ID already exists.";
//            }
//        }
//        shipList.add(shipbean);
//        return "SUCCESS: Ship added successfully.";
//	}
//
//	@Override
//	public boolean modifyShip(ShipBean shipbean) {
//		  for (ShipBean existingShip : shipList) {
//		       if (existingShip.getShipID().equals(shipbean.getShipID())) {
//		       existingShip.setShipName(shipbean.getShipName()); 
//		       existingShip.setSeatingCapacity(shipbean.getSeatingCapacity());
//		       existingShip.setReservationCapacity(shipbean.getReservationCapacity());
//               return true;
//		        }
//		    }
//		return false;
//	  }
//	public List<ShipBean> getAllShips() {
//	    return shipList;
//	}
//
//	@Override
//	public int removeShip(ArrayList<String> ShipId) {
//		int removedCount = 0;
//	    for (String id : ShipId) {
//	        ShipBean toRemove = null;
//	        for (ShipBean ship : shipList) {
//	            if (ship.getShipID().equals(id)) {
//	                toRemove = ship;
//	                break;
//	            }
//	        }
//	        if (toRemove != null) {
//	            shipList.remove(toRemove);
//	            removedCount++;
//	        }
//	    }
//	    return removedCount;
//	}
//
//	public String addRoute(RouteBean routebean) {
//        routeList.add(routebean);
//        return "SUCCESS";
//    }
//
//    // Modify an existing route
//    public boolean modifyRoute(RouteBean routebean) {
//        for (RouteBean rb : routeList) {
//            if (rb.getRouteID().equals(routebean.getRouteID())) {
//                rb.setSource(routebean.getSource());
//                rb.setDestination(routebean.getDestination());
//                rb.setTravelDuration(routebean.getTravelDuration());
//                rb.setFare(routebean.getFare());
//                return true;
//            }
//        }
//        return false;
//    }
//
//    // Remove a route by ID
//    public int removeRoute(String routeID) {
//        for (RouteBean rb : routeList) {
//            if (rb.getRouteID().equals(routeID)) {
//                routeList.remove(rb);
//                return 1;
//            }
//        }
//        return 0;
//    }
//    // View all routes
//    public List<RouteBean> getAllRoutes() {
//        return routeList;
//    }
//}
