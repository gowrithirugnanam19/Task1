package com.ust.srs.ui;

import com.ust.srs.bean.CredentialsBean;
import com.ust.srs.bean.ShipBean;
import com.ust.srs.bean.RouteBean;
import com.ust.srs.dao.AdministratorDAO;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AdministratorDAO admin = new AdministratorDAO();

        CredentialsBean adminUser = new CredentialsBean();
        adminUser.setUserID("AA-001");
        adminUser.setPassword("admin");
        adminUser.setUserType("Admin");
        admin.addUser(adminUser);

        // Login
        boolean loggedIn = false;
        while (!loggedIn) {
            String inputID = JOptionPane.showInputDialog("Enter User ID:");
            String inputPass = JOptionPane.showInputDialog("Enter Password:");
            String inputType = JOptionPane.showInputDialog("Enter User Type:");

            if (inputID.equals(adminUser.getUserID()) &&
                inputPass.equals(adminUser.getPassword()) &&
                inputType.equalsIgnoreCase(adminUser.getUserType())) {
                adminUser.setLoginStatus(0);
                loggedIn = true;
                JOptionPane.showMessageDialog(null, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(null, "Login Failed. Please try again.");
            }
        }

        // Add default ship
        ShipBean defaultShip = new ShipBean();
        defaultShip.setShipID("5445");
        defaultShip.setShipName("Dragon");
        defaultShip.setSeatingCapacity(500);
        defaultShip.setReservationCapacity(200);
        admin.addShip(defaultShip);

        // Add default route
        RouteBean defaultRoute = new RouteBean();
        defaultRoute.setRouteID("7899");
        defaultRoute.setSource("Kanyakumari");
        defaultRoute.setDestination("Trivandrum");
        defaultRoute.setTravelDuration("2 Hours");
        defaultRoute.setFare(450);
        admin.addRoute(defaultRoute);

        boolean continueProgram = true;
        while (continueProgram) {
            String operationID = JOptionPane.showInputDialog(
                "Choose Operation:\n\n" +
                "AD-001: Add Ship\n" +
                "AD-002: Modify Ship\n" +
                "AD-003: Delete Ship\n" +
                "AD-004: Add Route\n" +
                "AD-005: Modify Route\n" +
                "AD-006: Delete Route\n" +
                "AD-007: View All Ships\n" +
                "AD-008: View All Routes\n\n" +
                "Enter Operation ID:"
            );

            switch (operationID) {
                case "AD-001": // Add Ship
                    String shipID = JOptionPane.showInputDialog("Enter Ship ID:");
                    String shipName = JOptionPane.showInputDialog("Enter Ship Name:");
                    int seatingCapacity = Integer.parseInt(JOptionPane.showInputDialog("Enter Seating Capacity:"));
                    int reservationCapacity = Integer.parseInt(JOptionPane.showInputDialog("Enter Reservation Capacity:"));

                    ShipBean ship = new ShipBean();
                    ship.setShipID(shipID);
                    ship.setShipName(shipName);
                    ship.setSeatingCapacity(seatingCapacity);
                    ship.setReservationCapacity(reservationCapacity);

                    JOptionPane.showMessageDialog(null, admin.addShip(ship));
                    break;

                case "AD-002": // Modify Ship
                    String modID = JOptionPane.showInputDialog("Enter Ship ID to Modify:");
                    String newName = JOptionPane.showInputDialog("Enter New Ship Name:");
                    int newSeating = Integer.parseInt(JOptionPane.showInputDialog("Enter New Seating Capacity:"));
                    int newReservation = Integer.parseInt(JOptionPane.showInputDialog("Enter New Reservation Capacity:"));

                    ShipBean modShip = new ShipBean();
                    modShip.setShipID(modID);
                    modShip.setShipName(newName);
                    modShip.setSeatingCapacity(newSeating);
                    modShip.setReservationCapacity(newReservation);

                    boolean modified = admin.modifyShip(modShip);
                    JOptionPane.showMessageDialog(null, modified ? "Ship modified successfully." : "Ship not found.");
                    break;

                case "AD-003": // Delete Ship
                    String removeId = JOptionPane.showInputDialog("Enter Ship ID to Remove:");
                    ArrayList<String> removeList = new ArrayList<>();
                    removeList.add(removeId);

                    int removed = admin.removeShip(removeList);
                    JOptionPane.showMessageDialog(null, removed > 0 ? "Ship removed successfully." : "Ship ID not found.");
                    break;

                case "AD-004": // Add Route
                    String routeID = JOptionPane.showInputDialog("Enter Route ID:");
                    String source = JOptionPane.showInputDialog("Enter Source:");
                    String destination = JOptionPane.showInputDialog("Enter Destination:");
                    String duration = JOptionPane.showInputDialog("Enter Travel Duration:");
                    double fare = Double.parseDouble(JOptionPane.showInputDialog("Enter Fare:"));

                    RouteBean route = new RouteBean();
                    route.setRouteID(routeID);
                    route.setSource(source);
                    route.setDestination(destination);
                    route.setTravelDuration(duration);
                    route.setFare(fare);

                    JOptionPane.showMessageDialog(null, admin.addRoute(route));
                    break;

                case "AD-005": // Modify Route
                    String modRouteID = JOptionPane.showInputDialog("Enter Route ID to Modify:");
                    String newSource = JOptionPane.showInputDialog("Enter New Source:");
                    String newDestination = JOptionPane.showInputDialog("Enter New Destination:");
                    String newDuration = JOptionPane.showInputDialog("Enter New Travel Duration:");
                    double newFare = Double.parseDouble(JOptionPane.showInputDialog("Enter New Fare:"));

                    RouteBean modRoute = new RouteBean();
                    modRoute.setRouteID(modRouteID);
                    modRoute.setSource(newSource);
                    modRoute.setDestination(newDestination);
                    modRoute.setTravelDuration(newDuration);
                    modRoute.setFare(newFare);

                    boolean routeModified = admin.modifyRoute(modRoute);
                    JOptionPane.showMessageDialog(null, routeModified ? "Route modified successfully." : "Route not found.");
                    break;

                case "AD-006": // Delete Route
                    String deleteRouteID = JOptionPane.showInputDialog("Enter Route ID to Delete:");
                    int routeRemoved = admin.removeRoute(deleteRouteID);
                    JOptionPane.showMessageDialog(null, routeRemoved > 0 ? "Route removed successfully." : "Route ID not found.");
                    break;

                case "AD-007": // View All Ships
                    List<ShipBean> ships = admin.getAllShips();
                    if (ships.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No ships available.");
                    } else {
                        StringBuilder sb = new StringBuilder("Ship List:\n\n");
                        for (ShipBean s : ships) {
                            sb.append("Ship ID: ").append(s.getShipID()).append("\n");
                            sb.append("Ship Name: ").append(s.getShipName()).append("\n");
                            sb.append("Seating Capacity: ").append(s.getSeatingCapacity()).append("\n");
                            sb.append("Reservation Capacity: ").append(s.getReservationCapacity()).append("\n\n");
                        }
                        JOptionPane.showMessageDialog(null, sb.toString());
                    }
                    break;

                case "AD-008": // View All Routes
                    List<RouteBean> routes = admin.getAllRoutes();
                    if (routes.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No routes available.");
                    } else {
                        StringBuilder sb = new StringBuilder("Route List:\n\n");
                        for (RouteBean r : routes) {
                            sb.append("Route ID: ").append(r.getRouteID()).append("\n");
                            sb.append("Source: ").append(r.getSource()).append("\n");
                            sb.append("Destination: ").append(r.getDestination()).append("\n");
                            sb.append("Travel Duration: ").append(r.getTravelDuration()).append("\n");
                            sb.append("Fare: ₹").append(r.getFare()).append("\n\n");
                        }
                        JOptionPane.showMessageDialog(null, sb.toString());
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid Operation ID.");
            }

            int confirm = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Continue", JOptionPane.YES_NO_OPTION);
            if (confirm != JOptionPane.YES_OPTION) {
                continueProgram = false;
                JOptionPane.showMessageDialog(null, "Exiting program.");
            }
        }
    }
}




//package com.ust.srs.ui;
//
//import com.ust.srs.bean.CredentialsBean;
//import com.ust.srs.bean.ShipBean;
//import com.ust.srs.dao.AdministratorDAO;
//
//import javax.swing.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//        AdministratorDAO admin = new AdministratorDAO();
//
//        CredentialsBean adminUser = new CredentialsBean();
//        adminUser.setUserID("AA-001");
//        adminUser.setPassword("admin");
//        adminUser.setUserType("Admin");
//        admin.addUser(adminUser);
//
//        // Login
//        boolean loggedIn = false;
//        while (!loggedIn) {
//            String inputID = JOptionPane.showInputDialog("Enter User ID:");
//            String inputPass = JOptionPane.showInputDialog("Enter Password:");
//            String inputType = JOptionPane.showInputDialog("Enter User Type:");
//
//            if (inputID.equals(adminUser.getUserID()) &&
//                inputPass.equals(adminUser.getPassword()) &&
//                inputType.equalsIgnoreCase(adminUser.getUserType())) {
//                adminUser.setLoginStatus("Logged In");
//                loggedIn = true;
//                JOptionPane.showMessageDialog(null, "Login Successful");
//            } else {
//                JOptionPane.showMessageDialog(null, "Login Failed. Please try again.");
//            }
//        }
//
//        // Add default ship
//        ShipBean defaultShip = new ShipBean();
//        defaultShip.setShipID("5445");
//        defaultShip.setShipName("Dragon");
//        defaultShip.setSeatingCapacity(500);
//        defaultShip.setReservationCapacity(200);
//        admin.addShip(defaultShip);
//
//        boolean continueProgram = true;
//        while (continueProgram) {
//            String operationID = JOptionPane.showInputDialog(
//                "Choose Operation:\n\n" +
//                "AD-001: Add Ship\n" +
//                "AD-002: Modify Ship\n" +
//                "AD-003: Delete Ship\n" +
//                "AD-004: View All Ships\n\n" +
//                "Enter Operation ID:"
//            );
//
//            switch (operationID) {
//                case "AD-001": // Add Ship
//                    String shipID = JOptionPane.showInputDialog("Enter Ship ID:");
//                    String shipName = JOptionPane.showInputDialog("Enter Ship Name:");
//                    int seatingCapacity = Integer.parseInt(JOptionPane.showInputDialog("Enter Seating Capacity:"));
//                    int reservationCapacity = Integer.parseInt(JOptionPane.showInputDialog("Enter Reservation Capacity:"));
//
//                    ShipBean ship = new ShipBean();
//                    ship.setShipID(shipID);
//                    ship.setShipName(shipName);
//                    ship.setSeatingCapacity(seatingCapacity);
//                    ship.setReservationCapacity(reservationCapacity);
//
//                    JOptionPane.showMessageDialog(null, admin.addShip(ship));
//                    break;
//
//                case "AD-002": // Modify Ship
//                    String modID = JOptionPane.showInputDialog("Enter Ship ID to Modify:");
//                    String newName = JOptionPane.showInputDialog("Enter New Ship Name:");
//                    int newSeating = Integer.parseInt(JOptionPane.showInputDialog("Enter New Seating Capacity:"));
//                    int newReservation = Integer.parseInt(JOptionPane.showInputDialog("Enter New Reservation Capacity:"));
//
//                    ShipBean modShip = new ShipBean();
//                    modShip.setShipID(modID);
//                    modShip.setShipName(newName);
//                    modShip.setSeatingCapacity(newSeating);
//                    modShip.setReservationCapacity(newReservation);
//
//                    boolean modified = admin.modifyShip(modShip);
//                    JOptionPane.showMessageDialog(null, modified ? "Ship modified successfully." : "Ship not found.");
//                    break;
//
//                case "AD-003": // Delete Ship
//                    String removeId = JOptionPane.showInputDialog("Enter Ship ID to Remove:");
//                    ArrayList<String> removeList = new ArrayList<>();
//                    removeList.add(removeId);
//
//                    int removed = admin.removeShip(removeList);
//                    JOptionPane.showMessageDialog(null, removed > 0 ? "Ship removed successfully." : "Ship ID not found.");
//                    break;
//
//                case "AD-004": // View All Ships
//                    List<ShipBean> ships = admin.getAllShips();
//                    if (ships.isEmpty()) {
//                        JOptionPane.showMessageDialog(null, "No ships available.");
//                    } else {
//                        StringBuilder sb = new StringBuilder("Ship List:\n\n");
//                        for (ShipBean s : ships) {
//                            sb.append("Ship ID: ").append(s.getShipID()).append("\n");
//                            sb.append("Ship Name: ").append(s.getShipName()).append("\n");
//                            sb.append("Seating Capacity: ").append(s.getSeatingCapacity()).append("\n");
//                            sb.append("Reservation Capacity: ").append(s.getReservationCapacity()).append("\n\n");
//                        }
//                        JOptionPane.showMessageDialog(null, sb.toString());
//                    }
//                    break;
//
//                default:
//                    JOptionPane.showMessageDialog(null, "Invalid Operation ID.");
//            }
//
//            int confirm = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Continue", JOptionPane.YES_NO_OPTION);
//            if (confirm != JOptionPane.YES_OPTION) {
//                continueProgram = false;
//                JOptionPane.showMessageDialog(null, "Exiting program.");
//            }
//        }
//    }
//}




//package com.ust.srs.ui;
//
//import com.ust.srs.bean.CredentialsBean;
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
//        CredentialsBean adminUser = new CredentialsBean();
//        adminUser.setUserID("AA-001");
//        adminUser.setPassword("admin");
//        adminUser.setUserType("Admin");
//        //adminUser.setLoginStatus("Not Logged In");
//        admin.addUser(adminUser);
//        // Login
//        boolean loggedIn = false;
//        while (!loggedIn) {
//            System.out.println("Login Required");
//            System.out.println();
//            System.out.print("Enter User ID: ");
//            String inputID = sc.nextLine().trim();
//
//            System.out.print("Enter Password: ");
//            String inputPass = sc.nextLine().trim();
//
//            System.out.print("Enter User Type: ");
//            String inputType = sc.nextLine().trim();
//            if (inputID.equals(adminUser.getUserID()) &&
//                inputPass.equals(adminUser.getPassword()) &&
//                inputType.equalsIgnoreCase(adminUser.getUserType())) {
//                adminUser.setLoginStatus("Logged In");
//                loggedIn = true;
//                System.out.println("Login Successful");
//            } else {
//                System.out.println("Login Failed. Please try again.\n");
//            }
//        }
//
//        
//        ShipBean defaultShip = new ShipBean();
//        defaultShip.setShipID("5445");
//        defaultShip.setShipName("Dragon");
//        defaultShip.setSeatingCapacity(500);
//        defaultShip.setReservationCapacity(200);
//        admin.addShip(defaultShip);
//
//        boolean continueProgram = true;
//        while (continueProgram) {
//            System.out.println("\nChoose Operation:");
//            System.out.println();
//            System.out.println("AD-001: Add Ship");
//            System.out.println("AD-002: Modify Ship");
//            System.out.println("AD-003: Delete Ship");
//            System.out.println("AD-004: View All Ships");
//            System.out.print("Enter Operation ID: ");
//            String operationID = sc.nextLine().trim();
//
//            switch (operationID) {
//                case "AD-001": // Add Ship
//                    System.out.println("Enter Ship Details to Add");
//                    System.out.println();
//                    System.out.print("Ship ID: ");
//                    String shipID = sc.nextLine();
//
//                    System.out.print("Ship Name: ");
//                    String shipName = sc.nextLine();
//
//                    System.out.print("Seating Capacity: ");
//                    int seatingCapacity = sc.nextInt();
//
//                    System.out.print("Reservation Capacity: ");
//                    int reservationCapacity = sc.nextInt();
//                    sc.nextLine(); // consume newline
//
//                    ShipBean ship = new ShipBean();
//                    ship.setShipID(shipID);
//                    ship.setShipName(shipName);
//                    ship.setSeatingCapacity(seatingCapacity);
//                    ship.setReservationCapacity(reservationCapacity);
//
//                    System.out.println(admin.addShip(ship));
//                    break;
//
//                case "AD-002": // Modify Ship
//                    System.out.println("Enter Ship ID to Modify:");
//                    String modID = sc.nextLine();
//
//                    System.out.print("New Ship Name: ");
//                    String newName = sc.nextLine();
//
//                    System.out.print("New Seating Capacity: ");
//                    int newSeating = sc.nextInt();
//
//                    System.out.print("New Reservation Capacity: ");
//                    int newReservation = sc.nextInt();
//                    sc.nextLine();
//                    ShipBean modShip = new ShipBean();
//                    modShip.setShipID(modID);
//                    modShip.setShipName(newName);
//                    modShip.setSeatingCapacity(newSeating);
//                    modShip.setReservationCapacity(newReservation);
//
//                    boolean modified = admin.modifyShip(modShip);
//                    System.out.println(modified ? "Ship modified successfully." : "Ship not found.");
//                    break;
//
//                case "AD-003": // Delete Ship
//                    System.out.println("Enter Ship ID to Remove:");
//                    String removeId = sc.nextLine().trim();
//
//                    ArrayList<String> removeList = new ArrayList<>();
//                    removeList.add(removeId);
//
//                    int removed = admin.removeShip(removeList);
//                    System.out.println(removed > 0 ? "Ship removed successfully." : "Ship ID not found.");
//                    break;
//               case "AD-004": // View All Ships
//                    System.out.println("Viewing All Ships...");
//                    break;
//                default:
//                    System.out.println("Invalid Operation ID.");
//            }
//            System.out.println("\nShip List:");
//            List<ShipBean> ships = admin.getAllShips();
//            if (ships.isEmpty()) {
//                System.out.println("No ships available.");
//            } else {
//                for (ShipBean s : ships) {
//                    System.out.println("Ship ID: " + s.getShipID());
//                    System.out.println("Ship Name: " + s.getShipName());
//                    System.out.println("Seating Capacity: " + s.getSeatingCapacity());
//                    System.out.println("Reservation Capacity: " + s.getReservationCapacity());
//                    System.out.println();
//                }
//            }
//
//            // Ask to continue or exit
//            System.out.print("\nContinue? (yes/no): ");
//            String choice = sc.nextLine().trim();
//            if (!choice.equalsIgnoreCase("yes")) {
//                continueProgram = false;
//                System.out.println("Exit");
//            }
//        }
//        sc.close();
//    }
//}
