//package com.ust.srs.ui;
//import com.ust.srs.dao.AdministratorDAO;
//
//import java.util.Scanner;
//
//import com.ust.srs.bean.CredentialsBean;
//public class Login {
//	public static void main(String[] args) {
//        AdministratorDAO admin = new AdministratorDAO();
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("Enter User Details");
//        System.out.print("User Type (Administrator/Customer): ");
//        String userType = sc.nextLine();
//
//        System.out.print("User ID: ");
//        String userID = sc.nextLine();
//
//        System.out.print("Password: ");
//        String password = sc.nextLine();
//
//        CredentialsBean user = new CredentialsBean();
//        user.setUserType(userType);
//        user.setUserID(userID);
//        user.setPassword(password);
//        user.setLoginStatus("Not Logged In");
//
//        System.out.println(admin.addUser(user));
//
//        System.out.println("\nLogin Attempt:");
//        System.out.print("Enter User ID: ");
//        String loginID = sc.nextLine();
//
//        System.out.print("Enter Password: ");
//        String loginPass = sc.nextLine();
//
//        boolean success = admin.authenticate(loginID, loginPass);
//        System.out.println(success ? "Login Successful" : "Login Failed");
//	}
//}



//main method

//---------------------------------------

//package com.ust.srs.ui;
//
//import com.ust.srs.bean.ShipBean;
//import com.ust.srs.dao.AdministratorDAO;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        AdministratorDAO admin = new AdministratorDAO();
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter Operation ID (AD-001 to AD-004):");
//        String operationID = sc.nextLine().trim();
//
//        switch (operationID) {
//            case "AD-001": // Add Ship
//                System.out.println("Enter Ship Details to Add");
//                System.out.print("Ship ID: ");
//                String shipID = sc.nextLine();
//
//                System.out.print("Ship Name: ");
//                String shipName = sc.nextLine();
//
//                System.out.print("Seating Capacity: ");
//                int seatingCapacity = sc.nextInt();
//
//                System.out.print("Reservation Capacity: ");
//                int reservationCapacity = sc.nextInt();
//                sc.nextLine(); // consume newline
//                ShipBean ship = new ShipBean();
//                ship.setShipID(shipID);
//                ship.setShipName(shipName);
//                ship.setSeatingCapacity(seatingCapacity);
//                ship.setReservationCapacity(reservationCapacity);
//
//                System.out.println(admin.addShip(ship));
//                break;
//
//            case "AD-002": // Modify Ship
//                System.out.println("Enter Ship ID to Modify:");
//                String modID = sc.nextLine();
//
//                System.out.print("New Ship Name: ");
//                String newName = sc.nextLine();
//
//                System.out.print("New Seating Capacity: ");
//                int newSeating = sc.nextInt();
//
//                System.out.print("New Reservation Capacity: ");
//                int newReservation = sc.nextInt();
//                sc.nextLine();
//
//                ShipBean modShip = new ShipBean();
//                modShip.setShipID(modID);
//                modShip.setShipName(newName);
//                modShip.setSeatingCapacity(newSeating);
//                modShip.setReservationCapacity(newReservation);
//
//                boolean modified = admin.modifyShip(modShip);
//                System.out.println(modified ? "Ship modified successfully." : "Ship not found.");
//                break;
//            case "AD-003": // Delete Ship
//                System.out.println("Enter Ship ID to Remove:");
//                String removeId = sc.nextLine().trim();
//
//                ArrayList<String> removeList = new ArrayList<>();
//                removeList.add(removeId);
//
//                int removed = admin.removeShip(removeList);
//                System.out.println(removed > 0 ? "Ship removed successfully." : "Ship ID not found.");
//                break;
//
//            case "AD-004": // View All Ships
//                System.out.println("All Ships:");
//                List<ShipBean> ships = admin.getAllShips();
//                for (ShipBean s : ships) {
//                    System.out.println(s);
//                }
//                break;
//
//            default:
//                System.out.println("Invalid Operation ID.");
//        }
//        System.out.println("\nShip List:");
//        List<ShipBean> ships = admin.getAllShips();
//        if (ships.isEmpty()) {
//            System.out.println("No ships available.");
//        } else {
//            for (ShipBean s : ships) {
//                System.out.println("Ship ID: " + s.getShipID());
//                System.out.println("Ship Name: " + s.getShipName());
//                System.out.println("Seating Capacity: " + s.getSeatingCapacity());
//                System.out.println("Reservation Capacity: " + s.getReservationCapacity());
//            }
//        }
//
//
//        sc.close();
//    }
//}


//-------------------------------------------------


//package com.ust.srs.ui;
//import com.ust.srs.bean.ShipBean;
//import com.ust.srs.dao.AdministratorDAO;
//import com.ust.srs.bean.CredentialsBean;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//	public class Main {
//		    public static void main(String[] args) {
//		    AdministratorDAO admin = new AdministratorDAO();
//		    Scanner sc = new Scanner(System.in);
//		 
//	        System.out.println("Enter Ship Details to Add");
//	        System.out.print("Ship ID: ");
//	        String shipID = sc.nextLine();
//
//	        System.out.print("Ship Name: ");
//	        String shipName = sc.nextLine();
//
//	        System.out.print("Seating Capacity: ");
//	        int seatingCapacity = sc.nextInt();
//
//	        System.out.print("Reservation Capacity: ");
//	        int reservationCapacity = sc.nextInt();
//	        sc.nextLine(); 
//	        ShipBean ship = new ShipBean();
//	        ship.setShipID(shipID);
//	        ship.setShipName(shipName);
//	        ship.setSeatingCapacity(seatingCapacity);
//	        ship.setReservationCapacity(reservationCapacity);
//
//	        System.out.println(admin.addShip(ship));
//	        System.out.println();
//	        List<ShipBean> ships = admin.getAllShips();
//	        for (ShipBean s : ships) {
//	            System.out.println(s);
//	        }
//	        
//	        System.out.println("\nEnter New Details to Modify the Same Ship");
//	        System.out.print("New Ship Name: ");
//	        String newName = sc.nextLine();
//
//	        System.out.print("New Seating Capacity: ");
//	        int newSeating = sc.nextInt();
//
//	        System.out.print("New Reservation Capacity: ");
//	        int newReservation = sc.nextInt();
//
//	        ship.setShipName(newName);
//	        ship.setSeatingCapacity(newSeating);
//	        ship.setReservationCapacity(newReservation);
//
//	        boolean modified = admin.modifyShip(ship);
//	        System.out.println(modified ? "Ship modified successfully." : "Ship not found.");
//	        System.out.println("\nAll Ships:");
//	        List<ShipBean> ships1 = admin.getAllShips();
//	        for (ShipBean s : ships1) {
//	            System.out.println(s);
//	        }
//            
//	        System.out.println("\nEnter Ship ID to Remove");
//	        //if(shipID == AD-001)
//	        System.out.print("Ship ID: ");
//	        String removeId = sc.nextLine().trim();
//
//	        ArrayList<String> removeList = new ArrayList<>();
//	        removeList.add(removeId);
//
//	        int removed = admin.removeShip(removeList);
//	        System.out.println(removed > 0 ? "Ship removed successfully." : "Ship ID not found.");
//
//	        System.out.println("\nRemaining Ships:");
//	        List<ShipBean> remainingShips = admin.getAllShips();
//	        for (ShipBean s : remainingShips) {
//                   System.out.println(s);
//	        }
//	        sc.close();
//	        
//	    }
//	}	
//	




//admin remaining methodss

//public String addSchedule(ScheduleBean schedulebean);
//public boolean modifySchedule(ScheduleBean schedulebean);
//public int removeSchedule(ArrayList<String> scheduleid);
//public String addRoute(RouteBean routebean);
//public boolean modifyRoute(RouteBean routebean);
//public int removeRoute(String routeid);
//public default ShipBean viewByShipId(String ShipId);
//public default RouteBean viewByRouteId(String routeid);
//public ArrayList<ShipBean> viewByAllShips();
//public ArrayList<RouteBean> viewByAllRoute();
//public ArrayList<ScheduleBean> viewByAllSchedule();