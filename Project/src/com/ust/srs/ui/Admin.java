package com.ust.srs.ui;

import com.ust.srs.bean.CredentialsBean;
import com.ust.srs.bean.PassengerBean;
import com.ust.srs.bean.RouteBean;
import com.ust.srs.bean.ScheduleBean;
import com.ust.srs.bean.ShipBean;
import com.ust.srs.dao.AdministratorDAO;
import com.ust.srs.util.Test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class Admin extends AdministratorDAO{
  			String choice;
	
	public void adminFunctions() {
		   //Frame and panel
	       final JFrame frame = new JFrame("BookWave");
	       frame.setSize(500, 600);
	       JPanel p = new JPanel();
	       
	       //Jlabel
	       JLabel label = new JLabel("Admin");
	       JLabel actionLabel = new JLabel("Select Action: ");
	       
	       //options array
	       	String [] options = {"AD-001", "AD-002","AD-003","AD-004","AD-005","AD-006","AD-007","AD-008","AD-009","AD-010","AD-011","AD-012","AD-013" };
	       	
	       	JComboBox<String> dropdown = new JComboBox<>(options);
	       	JButton confirmButton = new JButton("Confirm");
	       	
	     
	       	
	        confirmButton.addActionListener(new ActionListener(){
	        	@Override
	        	public void actionPerformed(ActionEvent e) {
	        		final Admin admin = new Admin();
	        		String choice = (String) dropdown.getSelectedItem();
	        		
	        		switch (choice) {
	        		
	        		
	        			case "AD-001" : 
	        				JLabel addShiplabel = new JLabel("Admin add ship");
	        				JButton addButton = new JButton("Add ship");
	        				
	        				JTextField shipIDField = new JTextField("ShipId",10);
	        				JTextField shipNameField = new JTextField("Ship Name",10);
	        				JTextField seatingField = new JTextField("Seating",10);
	        				JTextField reservField= new JTextField("Reservation Capacity",16);
	        				
	        				
	        				addButton.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent e) {

									String shipId = shipIDField.getText();
									String shipName = shipNameField.getText();
									int seating = Integer.parseInt(seatingField.getText());
									int  reservationCapacity = Integer.parseInt(reservField.getText());
									admin.addShip(new ShipBean(shipId, shipName, seating,reservationCapacity));
									System.out.println(Test.shipbean_Arr);
									
									p.remove(shipIDField);
			        				p.remove(shipNameField);
			        				p.remove(seatingField);
			        				p.remove(reservField);
			        				p.remove(addButton);
			        				p.remove(addShiplabel);
			        				
			        				p.revalidate();
			                        p.repaint();
	        				}});
	        					

	        				p.add(addShiplabel);
	        				
	        				p.add(shipIDField);
	        				p.add(shipNameField);
	        				p.add(seatingField);
	        				p.add(reservField);
	        				
	        				p.add(addButton);
	        				
	        				p.revalidate();
	                        p.repaint();
	                        
	        				break;
	        				
	        			case "AD-004" : 
	        				
	        				JLabel modifyShiplabel = new JLabel("Admin modify ship");
	        				JButton modifyButton = new JButton("modify ship");
	        				
	        				JTextField mshipIDField = new JTextField("ShipID",10);
	        				JTextField mshipNameField = new JTextField("Ship Name",10);
	        				JTextField mseatingField = new JTextField("Seating",10);
	        				JTextField mreservField= new JTextField("Reservation Capacity",16);
	        				
	        				modifyButton.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent e) {
									
									String shipId = mshipIDField.getText();
									String shipName = mshipNameField.getText();
									int seating = Integer.parseInt(mseatingField.getText());
									int  reservationCapacity = Integer.parseInt(mreservField.getText());
									
									admin.modifyShip(new ShipBean(shipId, shipName, seating,reservationCapacity));
									System.out.println(Test.shipbean_Arr);
									
									p.remove(mshipIDField);
			        				p.remove(mshipNameField);
			        				p.remove(mseatingField);
			        				p.remove(mreservField);
			        				p.remove(modifyButton);
			        				p.remove(modifyShiplabel);
			        				
			        				p.revalidate();
			                        p.repaint();
	        				}});
	        					
	        				p.add(modifyShiplabel);
	        				
	        				p.add(mshipIDField);
	        				p.add(mshipNameField);
	        				p.add(mseatingField);
	        				p.add(mreservField);
	        				
	        				p.add(modifyButton);
	        				
	        				p.revalidate();
	                        p.repaint();
	                        
	        				break;
	        				
	        				
	        			case "AD-002" : 
	        				
	        				JLabel removeShiplabel = new JLabel("Admin remove ship");
	        				JButton removeButton = new JButton("remove ship");
	        				
	        				JTextField remshipIDField = new JTextField("ShipID",10);
	        			
	        				removeButton.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent e) {
									
									String shipId = remshipIDField.getText();
									
									ArrayList <String> removeList = new ArrayList<String>();
									String[] removeArray = shipId.split(",");
									for(String shipid : removeArray) {
										removeList.add(shipid);
									}
									
									admin.removeShip(removeList);
									System.out.println(Test.shipbean_Arr);
									
									p.remove(removeShiplabel);
			        				p.remove(removeButton);
			        				p.remove(remshipIDField);
			        				
			        				p.revalidate();
			                        p.repaint();
	        				}});
	        					
	        				p.add(removeShiplabel);
	        				p.add(removeButton);
	        				p.add(remshipIDField);
	        				
	        				p.revalidate();
	                        p.repaint();
	                        
	        				break;
	        				
	        			case "AD-003" : 
	        				
	        				JLabel viewShipByidLabel = new JLabel("Admin view ship");
	        				JButton viewShipButton = new JButton("view ship");
	        				
	        				JTextField viewshipIDField = new JTextField("ShipID",10);
	        			
	        				viewShipButton.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent e) {
									
									String shipId = viewshipIDField.getText();
									
									System.out.println("ID"+shipId);
									ShipBean ship = admin.viewByShipId(shipId);
									System.out.println(ship);
									
									 JDialog d = new JDialog(frame, "Dialog box");
									 d.setSize(200, 150);
									 d.setLayout(new BoxLayout(d.getContentPane(), BoxLayout.Y_AXIS));
									 JLabel shipinfo = new JLabel("<html> Ship ID: "+ship.getShipID()+"<br>Ship Name: "+ship.getShipName() + "<br>Ship Seating Capacity: "+ship.getSeatingCapacity() + "<br>Ship reservation capacity: "+ship.getReservationCapacity()+"</html>");
									 
									 d.add(new JLabel("VIEW SHIP"));
									 d.add(shipinfo);
									 d.setVisible(true);
									 
									 p.revalidate();
				                     p.repaint();
									 
									p.remove( viewShipByidLabel);
			        				p.remove(viewShipButton);
			        				p.remove(viewshipIDField);
			        				
			        				p.revalidate();
			                        p.repaint();
	        				}});
	        					
	        				p.add( viewShipByidLabel);	
	        				p.add(viewShipButton);
	        				p.add(viewshipIDField);
	        				
	        				p.revalidate();
	                        p.repaint();
	                        
	        				break;
	        				
	        				

	        			case "AD-005" : 
	        				JLabel routeAddlabel = new JLabel("Admin add route");
	        				JButton routeaddButton = new JButton("Add route");
	        				
	        				JTextField routeIDField = new JTextField("Route ID",10);
	        				JTextField sourceField = new JTextField("Source Name",10);
	        				JTextField destinationField = new JTextField("Destination name", 15);
	        				JTextField durationField = new JTextField("Travel Duration",10);
	        				JTextField fareField= new JTextField("fare",16);
	        				
	        				
	        				routeaddButton.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent e) {

									String routeId = routeIDField.getText();
									String source = sourceField.getText();
									String destination = destinationField.getText();
									String duration = durationField.getText();
									double fare =    Double.parseDouble(fareField.getText());
									
									admin.addRoute(new RouteBean(routeId,source,destination,duration,fare));
									System.out.println(Test.routebean);
									
									p.remove(routeaddButton);
									p.remove(routeAddlabel);
									p.remove(routeIDField);
			        				p.remove(sourceField);
			        				p.remove(destinationField);
			        				p.remove(durationField);
			        				p.remove(fareField);
			      
			        				p.revalidate();
			                        p.repaint();
	        				}});
	        					
	        				p.add(routeAddlabel);
	        				p.add(routeIDField);
	        				p.add(sourceField);
	        				p.add(destinationField);
	        				p.add(durationField);
	        				p.add(fareField);
	      
	        				
	        				p.add(routeaddButton);
	        				
	        				p.revalidate();
	                        p.repaint();
	                        
	        				break;
	        				

	        			case "AD-006" : 
	        				
	        				JLabel delRouteByidLabel = new JLabel("Admin delete ship");
	        				JButton delRouteButton = new JButton("Delete Ship");
	        				
	        				JTextField delRouteIDField = new JTextField("Route ID",10);
	        			
	        				delRouteButton.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent e) {
									
									String routeId = delRouteIDField.getText();
									admin.removeRoute(routeId);
									System.out.println(Test.routebean);
								 
									 p.revalidate();
				                     p.repaint();
									 
									p.remove( delRouteByidLabel );
			        				p.remove(delRouteButton);
			        				p.remove( delRouteIDField);
			        				
			        				p.revalidate();
			                        p.repaint();
	        				}});
	        					
	        				p.add( delRouteByidLabel );
	        				p.add(delRouteButton);
	        				p.add( delRouteIDField);
	        				

	        				p.revalidate();
	                        p.repaint();
	                        
	                        
	        				case "AD-007" : 
	        				
	        				JLabel viewRouteByidLabel = new JLabel("Admin view Route");
	        				JButton viewRouteButton = new JButton("view Route");
	        				
	        				JTextField viewRouteIDField = new JTextField("RouteID",10);
	        			
	        				viewRouteButton.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent e) {
									
									String routeId = viewRouteIDField.getText();
									
									System.out.println("ID"+routeId);
									RouteBean route = admin.viewByRouteId(routeId);
									System.out.println(route);
									
									 JDialog d = new JDialog(frame, "Dialog box");
									 d.setSize(200, 150);
									 d.setLayout(new BoxLayout(d.getContentPane(), BoxLayout.Y_AXIS));
									 JLabel routeInfo= new JLabel("<html> Route ID: "+route.getRouteID()+"<br> Source Name: "+route.getSource()+ "<br> Destination: : "+route.getDestination() + "<br> Travel Duration: "+route.getTravelDuration()+"<br> Travel Fare: "+route.getFare()+"</html>");
									 
									 d.add(new JLabel("VIEW ROUTE"));
									 d.add(routeInfo);
									 d.setVisible(true);
									 
									 p.revalidate();
				                     p.repaint();
									 
									p.remove( viewRouteByidLabel);
			        				p.remove(viewRouteButton);
			        				p.remove(viewRouteIDField);
			        				
			        				p.revalidate();
			                        p.repaint();
	        				}});
	        				
	        				p.add( viewRouteByidLabel);
	        				p.add(viewRouteButton);
	        				p.add(viewRouteIDField);
	        				
	        				p.revalidate();
	                        p.repaint();
	    
	                        
	                        
	        				case "AD-008" : 
		        				JLabel routeModifylabel = new JLabel("Admin Mofify route");
		        				JButton routeModifyButton = new JButton("Modify route");
		        				
		        				JTextField mrouteIDField = new JTextField("Route ID",10);
		        				JTextField msourceField = new JTextField("Source Name",10);
		        				JTextField mdestinationField = new JTextField("Destination name", 15);
		        				JTextField mdurationField = new JTextField("Travel Duration",10);
		        				JTextField mfareField= new JTextField("fare",16);
		        				
		        				
		        				routeModifyButton.addActionListener(new ActionListener(){

									@Override
									public void actionPerformed(ActionEvent e) {

										String routeId = mrouteIDField.getText();
										String source = msourceField.getText();
										String destination = mdestinationField.getText();
										String duration = mdurationField.getText();
										double fare =    Double.parseDouble(mfareField.getText());
										
										admin.addRoute(new RouteBean(routeId,source,destination,duration,fare));
										System.out.println(Test.routebean);
										
										p.remove(routeModifyButton);
										p.remove(routeModifylabel);
										p.remove(mrouteIDField);
				        				p.remove(msourceField);
				        				p.remove(mdestinationField);
				        				p.remove(mdurationField);
				        				p.remove(mfareField);
				      
				        				p.revalidate();
				                        p.repaint();
		        				}});
		        					
		        				p.add(routeModifyButton);
								p.add(routeModifylabel);
								p.add(mrouteIDField);
		        				p.add(msourceField);
		        				p.add(mdestinationField);
		        				p.add(mdurationField);
		        				p.add(mfareField);
		        				
		        				p.revalidate();
		                        p.repaint();
		                        
		        				break;
		        				
		        				
	        				case "AD-009":
	        				    JLabel scheduleAddLabel = new JLabel("Admin Add Schedule");
	        				    JButton scheduleAddButton = new JButton("Add Schedule");

	        				    JTextField scheduleIDField = new JTextField("Schedule ID", 10);
	        				    JTextField schshipIDField = new JTextField("Ship ID", 10);
	        				    JTextField schrouteIDField = new JTextField("Route ID", 10);
	        				    JTextField startDateField = new JTextField("Start Date (yyyy-MM-dd)", 15);

	        				    scheduleAddButton.addActionListener(new ActionListener() {
	        				        @Override
	        				        public void actionPerformed(ActionEvent e) {
	        				            String scheduleID = scheduleIDField.getText();
	        				            String shipID = schshipIDField.getText();
	        				            String routeID = schrouteIDField.getText();
	        				            String startDateStr = startDateField.getText();

	        
	        				            admin.addSchedule(new ScheduleBean(scheduleID, shipID, routeID, startDateStr));
	        				            System.out.println(Test.schbean_Arr);

	        				                // Remove components
	        				                p.remove(scheduleAddLabel);
	        				                p.remove(scheduleAddButton);
	        				                p.remove(scheduleIDField);
	        				                p.remove(schshipIDField);
	        				                p.remove(schrouteIDField);
	        				                p.remove(startDateField);

	        				                p.revalidate();
	        				                p.repaint();
	        				        }
	        				    });

	        				    p.add(scheduleAddLabel);
	        				    p.add(scheduleIDField);
	        				    p.add(schshipIDField);
	        				    p.add(schrouteIDField);
	        				    p.add(startDateField);
	        				    p.add(scheduleAddButton);

	        				    p.revalidate();
	        				    p.repaint();
	        				    break;
	        				    
	        				    
	        				    
	        				    
	        				case "AD-010":
	        				    JLabel removeScheduleLabel = new JLabel("Admin Remove Schedule");
	        				    JButton removeScheduleButton = new JButton("Remove Schedule");

	        				    JTextField remScheduleIDField = new JTextField("ScheduleID(s)", 20);

	        				    removeScheduleButton.addActionListener(new ActionListener() {
	        				        @Override
	        				        public void actionPerformed(ActionEvent e) {
	        				            String scheduleIds = remScheduleIDField.getText();

	        				            ArrayList<String> removeList = new ArrayList<>();
	        				            String[] removeArray = scheduleIds.split(",");
	        				            
	        				            for (String removeID : removeArray) {
	        				            	removeList.add(removeID);
	        				            }
	        				            
	        				            admin.removeSchedule(removeList);
	        				            System.out.println(Test.schbean_Arr);
	        				            
	        				            p.remove(removeScheduleLabel);
	        				            p.remove(removeScheduleButton);
	        				            p.remove(remScheduleIDField);

	        				            p.revalidate();
	        				            p.repaint();
	        				        }
	        				    });

	        				    p.add(removeScheduleLabel);
	        				    p.add(remScheduleIDField);
	        				    p.add(removeScheduleButton);

	        				    p.revalidate();
	        				    p.repaint();
	        				    break;
	        				    
	        				    
	        				case "AD-011":
	        				    JLabel viewScheduleLabel = new JLabel("Admin View Schedule");
	        				    JButton viewScheduleButton = new JButton("View Schedule");

	        				    JTextField viewScheduleIDField = new JTextField("ScheduleID", 10);

	        				    viewScheduleButton.addActionListener(new ActionListener() {
	        				        @Override
	        				        public void actionPerformed(ActionEvent e) {
	        				            String scheduleID = viewScheduleIDField.getText();
	        				            System.out.println("Schedule ID: " + scheduleID);

	        				            ScheduleBean schedule = admin.viewByScheduledId(scheduleID);
	        				            System.out.println(schedule);

	        				            JDialog d = new JDialog(frame, "Schedule Details");
	        				            d.setSize(300, 200);
	        				            d.setLayout(new BoxLayout(d.getContentPane(), BoxLayout.Y_AXIS));

	        				            JLabel scheduleInfo = new JLabel("<html>" +
	        				                "Schedule ID: " + schedule.getScheduleID() + "<br>" +
	        				                "Ship ID: " + schedule.getShipID() + "<br>" +
	        				                "Route ID: " + schedule.getRouteID() + "<br>" +
	        				                "Start Date: " + schedule.getStartDate() +
	        				                "</html>");

	        				            d.add(new JLabel("VIEW SCHEDULE"));
	        				            d.add(scheduleInfo);
	        				            d.setLocationRelativeTo(frame);
	        				            d.setVisible(true);

	        				            // Clean up UI
	        				            p.remove(viewScheduleLabel);
	        				            p.remove(viewScheduleButton);
	        				            p.remove(viewScheduleIDField);

	        				            p.revalidate();
	        				            p.repaint();
	        				        }
	        				    });

	        				    p.add(viewScheduleLabel);
	        				    p.add(viewScheduleIDField);
	        				    p.add(viewScheduleButton);

	        				    p.revalidate();
	        				    p.repaint();
	        				    break;
	        				    
	        				    
	        				case "AD-012":
	        				    JLabel modifyScheduleLabel = new JLabel("Admin Modify Schedule");
	        				    JButton modifyScheduleButton = new JButton("Modify Schedule");

	        				    JTextField mSscheduleIDField = new JTextField("Schedule ID", 10);
	        				    JTextField mSshipIDField = new JTextField("Ship ID", 10);
	        				    JTextField mSrouteIDField = new JTextField("Route ID", 10);
	        				    JTextField mstartDateField = new JTextField("Start Date (yyyy-MM-dd)", 15);

	        				    modifyScheduleButton.addActionListener(new ActionListener() {
	        				        @Override
	        				        public void actionPerformed(ActionEvent e) {
	        				            String scheduleID = mSscheduleIDField.getText();
	        				            String shipID = mSshipIDField.getText();
	        				            String routeID = mSrouteIDField.getText();
	        				            String startDateStr = mstartDateField.getText();

	        				            	admin.modifySchedule(new ScheduleBean(scheduleID, shipID, routeID, startDateStr));
	        				                System.out.println(Test.schbean_Arr); 

	        				                p.remove(modifyScheduleLabel);
	        				                p.remove(modifyScheduleButton);
	        				                p.remove(mSscheduleIDField);
	        				                p.remove(mSshipIDField);
	        				                p.remove(mSrouteIDField);
	        				                p.remove(mstartDateField);

	        				                p.revalidate();
	        				                p.repaint();
	        				          
	        				        }
	        				    });

	        				    p.add(modifyScheduleLabel);
	        				    p.add(mSscheduleIDField);
	        				    p.add(mSshipIDField);
	        				    p.add(mSrouteIDField);
	        				    p.add(mstartDateField);
	        				    p.add(modifyScheduleButton);

	        				    p.revalidate();
	        				    p.repaint();
	        				    break;
	        				    
	        				    
	        				    
	        				case "AD-013":
	        				    JLabel viewPassLabel = new JLabel("Admin View Passengers");
	        				    JButton viewPassButton = new JButton("View Passengers");

	        				    JTextField vpscheduleIDField = new JTextField("Schedule ID", 10);
 
	        				    p.add(viewPassLabel);
	        				    p.add(vpscheduleIDField);
	        				    p.add(viewPassButton);
	        				    p.revalidate();
	        				    p.repaint();

	        				    viewPassButton.addActionListener(new ActionListener() {
	        				        @Override
	        				        public void actionPerformed(ActionEvent e) {
	        				            String scheduleID = vpscheduleIDField.getText().trim();

	        				            ArrayList<PassengerBean> passengers = admin.viewPassengersByShip(scheduleID);

	        				            JDialog d = new JDialog(frame, "Passengers for Schedule ID: " + scheduleID, true);
	        				            d.setSize(600, 400);
	  

	        				            if (passengers == null || passengers.isEmpty()) {
	        				                d.add(new JLabel("No passengers found for this Schedule ID"));
	        				            } else {
	        				                String[] columnNames = {"Schedule ID", "Name", "Gender", "Age", "Reservation ID"};
	        				                Object[][] data = new Object[passengers.size()][columnNames.length];

	        				                for (int i = 0; i < passengers.size(); i++) {
	        				                    PassengerBean passenger = passengers.get(i);
	        				             
	        				                    data[i][0] = passenger.getScheduleID();
	        				                    data[i][1] = passenger.getName();
	        				                    data[i][2] = passenger.getGender();
	        				                    data[i][3] = passenger.getAge();
	        				                    data[i][4] = passenger.getReservationID();
	        				                }

	        				                JTable passengerTable = new JTable(data, columnNames);
	        				                JScrollPane scrollPane = new JScrollPane(passengerTable);
	        				                
	        				                d.add(scrollPane);
	        				            }

	        				      
	        				            d.setVisible(true);
	        				            p.remove(viewPassLabel);
	    	        				    p.remove(vpscheduleIDField);
	    	        				    p.remove(viewPassButton);
	        				        
	        				            p.revalidate();
	        				            p.repaint();
	        				        }
	        				    });

	        				    break;
			
	        	}
	        }}
	        );
	       	
	       	p.add(label);
	       	p.add(actionLabel);
	       	p.add(dropdown);
	       	p.add(confirmButton);
	       
	       frame.add(p);	 
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       frame.setVisible(true);
	        
	}
	
}