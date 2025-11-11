
package com.ust.srs.dao;

import com.ust.srs.service.Administrator;
import com.ust.srs.bean.ShipBean;
import com.ust.srs.bean.CredentialsBean;
import com.ust.srs.bean.RouteBean;

import java.util.ArrayList;
import java.util.List;
public class AdministratorDAO implements Administrator{
	private static List<CredentialsBean> credentialsList = new ArrayList<>();
	private List<RouteBean> routeList = new ArrayList<>();
    public String addUser(CredentialsBean user) {
        for (CredentialsBean uc : credentialsList) {
            if (uc.getUserID().equals(user.getUserID())) {
                return "FAILURE: User ID already exists.";
            }
        }
        credentialsList.add(user);
        return "SUCCESS: User added.";
    }

    public boolean authenticate(String userID, String password) {
        for (CredentialsBean uc : credentialsList) {
            if (uc.getUserID().equals(userID) && uc.getPassword().equals(password)) {
                uc.setLoginStatus(0);
                return true;
            }
        }
        return false;
    }

	private static List<ShipBean> shipList = new ArrayList<>();

	@Override
	public String addShip(ShipBean shipbean) {
		for (ShipBean ship : shipList) {
            if (ship.getShipID().equals(shipbean.getShipID())) {
                return "FAILURE: Ship ID already exists.";
            }
        }
        shipList.add(shipbean);
        return "SUCCESS: Ship added successfully.";
	}

	@Override
	public boolean modifyShip(ShipBean shipbean) {
		  for (ShipBean existingShip : shipList) {
		       if (existingShip.getShipID().equals(shipbean.getShipID())) {
		       existingShip.setShipName(shipbean.getShipName()); 
		       existingShip.setSeatingCapacity(shipbean.getSeatingCapacity());
		       existingShip.setReservationCapacity(shipbean.getReservationCapacity());
               return true;
		        }
		    }
		return false;
	  }
	public List<ShipBean> getAllShips() {
	    return shipList;
	}

	@Override
	public int removeShip(ArrayList<String> ShipId) {
		int removedCount = 0;
	    for (String id : ShipId) {
	        ShipBean toRemove = null;
	        for (ShipBean ship : shipList) {
	            if (ship.getShipID().equals(id)) {
	                toRemove = ship;
	                break;
	            }
	        }
	        if (toRemove != null) {
	            shipList.remove(toRemove);
	            removedCount++;
	        }
	    }
	    return removedCount;
	}

	public String addRoute(RouteBean routebean) {
        routeList.add(routebean);
        return "SUCCESS";
    }

    // Modify an existing route
    public boolean modifyRoute(RouteBean routebean) {
        for (RouteBean rb : routeList) {
            if (rb.getRouteID().equals(routebean.getRouteID())) {
                rb.setSource(routebean.getSource());
                rb.setDestination(routebean.getDestination());
                rb.setTravelDuration(routebean.getTravelDuration());
                rb.setFare(routebean.getFare());
                return true;
            }
        }
        return false;
    }

    // Remove a route by ID
    public int removeRoute(String routeID) {
        for (RouteBean rb : routeList) {
            if (rb.getRouteID().equals(routeID)) {
                routeList.remove(rb);
                return 1;
            }
        }
        return 0;
    }
    // View all routes
    public List<RouteBean> getAllRoutes() {
        return routeList;
    }
}
