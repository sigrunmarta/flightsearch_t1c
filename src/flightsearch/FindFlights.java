package flightsearch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class FindFlights {
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pst = null;
	Statement stmt= null;
	
	public ArrayList<Flight> flights;
	
	public ArrayList<Flight> dbflights(String fromAirport, String toAirport, String dateDeparture)
	{
		conn = Db_connector.dbConnect();
		
		flights = new ArrayList<Flight>();
		
//		String sql = "SELECT * FROM Flights WHERE fromAirport=? AND dateDeparture=?";
		String sql = "SELECT * FROM Flights WHERE fromAirport=? AND toAirport=? AND dateDeparture=?";
		try{
			pst = conn.prepareStatement(sql);
			pst.setString(1, fromAirport);
			pst.setString(2, toAirport);
			pst.setString(3, dateDeparture);
//			pst.setString(1, "London");
//			pst.setString(2, "2015-03-01");
			
			rs = pst.executeQuery();
//			stmt=conn.createStatement();
//			rs=stmt.executeQuery(sql);
			
			while(rs.next()){
				/**
				 * Retrieve data from each row from the result set
				 */
				String rsFromAirport = rs.getString("fromAirport");
				String rsToAirport = rs.getString("toAirport");
				String rsDateDeparture = rs.getString("dateDeparture");
				String rsTimeDeparture = rs.getString("timeDeparture");
				String rsDateArrival = rs.getString("dateArrival");
				String rsTimeArrival = rs.getString("timeArrival");
				// todo: setja thetta i DB
				int rsAvailableSeats = 100;
				int rsPrice = 1000;
				int rsFlightNumber = 555;
				/**
				 * Create a new Flight object with the data
				 */
				Flight rightFlight = new Flight(rsFromAirport, 
										   rsToAirport, 
										   rsDateDeparture, 
										   rsDateArrival, 
										   rsTimeDeparture, 
										   rsTimeArrival, 
										   rsAvailableSeats, 
										   rsPrice, 
										   rsFlightNumber);
				
				/**
				 * Add the Flight object to a list of flights that
				 * match the criteria
				 */
				flights.add(rightFlight);
				
				
				// DEBUG
//				System.out.println("fromAirport: " + fromAirport);
//				System.out.println("toAirport: " + rsToAirport);
//				System.out.println("Departure Date: " + rsDateDeparture);
//				System.out.println("Departure Time: " + rsTimeDeparture);
//				System.out.println("Arrival Date: " + rsDateArrival);
//				System.out.println("Arrival Time: " + rsTimeArrival);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return flights;
	}
	
	
	
	/**
	 * Get flights based on parameters.
	 * 
	 * @param fromAirport From what airport the plane is leaving
	 * @param toAirport   At what airport the plane is landing
	 * @param dateDeparture Date of flight departure
	 * @param dateArrival   Date of flight arrival
	 * @return ArrayList of Flight objects that correspond to the given
	 * parameters. Returns null if none exist.
	 */
	public ArrayList<Flight> getFlights(String fromAirport,
										String toAirport,
										String dateDeparture,
										String dateArrival)
	{
		// Get all the flights from the database
		flights = getAllFlights();
		
		// Create an ArrayList to which we will add all correct flights
		ArrayList<Flight> correctFlights = new ArrayList<Flight>();
		
		// First get the flights that have the correct airports
		correctFlights = getFlightsFromTo(flights, fromAirport, toAirport);
		// Second, get the flights that have the correct dates
		correctFlights = getFlightsDepartureArrival(correctFlights,dateDeparture,dateArrival);
		
		
		return correctFlights;
	}
	
	/**
	 * This method will create an ArrayList of flights that have the correct dates as requested
	 * @param correctFlights
	 * @param dateDeparture
	 * @param dateArrival
	 * @return
	 */
	public ArrayList<Flight> getFlightsDepartureArrival(
			ArrayList<Flight> correctFlights, String dateDeparture,
			String dateArrival) {
		
		ArrayList<Flight> returnFlights = new ArrayList<Flight>();
		
		// Iterate through the flights list
		for(int i = 0; i < correctFlights.size(); i++){
			
			// Get the flight at position i
			Flight tempFlight = correctFlights.get(i);
			
			// Check if the departure date matches
			if(dateDeparture == tempFlight.getDateDeparture()){
				
				// Check if the arrival date matches
				if(dateArrival == tempFlight.getDateArrival()){
					
					// Add it to the return flights list
					returnFlights.add(tempFlight);
				}
			}
		}
		
		return returnFlights;
	}

	/**
	 * This method will create an ArrayList of flights that have the
	 * correct airports as requested
	 * @param fromAirport
	 * @param toAirport
	 * @return An ArrayList of flights that are flying to and from the correct
	 * airports
	 */
	public ArrayList<Flight> getFlightsFromTo(ArrayList<Flight> flightList, String fromAirport,
											   String toAirport) {
		
		ArrayList<Flight> returnFlights = new ArrayList<Flight>();
		
		// Iterate through the flights list
		for(int i = 0; i < flightList.size(); i++){
			
			// Get the flight at position i
			Flight tempFlight = flightList.get(i);
			
			// Check if fromAirport matches
			if(fromAirport == tempFlight.getFromAirport()){
				
				// Check if toAirport matches
				if(toAirport == tempFlight.getToAirport()){
					
					// Add it to the return flights list
					returnFlights.add(tempFlight);
				}
			}
		}
		
		return returnFlights;
	}


	/**
	 * TODO: Here this function would call the class that handles
	 * 		 the Database connections, and get all the flights from
	 * 		 the database and return an ArrayList with those flights
	 * @return All flights that are in the database
	 */
	
	
	public ArrayList<Flight> getAllFlights()
	{
		// example:
		// ArrayList<Flight> allFlights;
		// allFlights = FlightDatabase.getAll(); 
		// return allFlights;
		
		conn = Db_connector.dbConnect();
		
		String sql = "SELECT * FROM Flights";
		
		try{
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				String name = rs.getString("fromAirport");
				System.out.println("From Airport: " + name);
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
		}catch(Exception e){}
		
		
		return null;
	}
}
