package flightsearch;

import java.util.ArrayList;

public class FindFlights {

	private ArrayList<Flight> flights;
	
	
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
	private ArrayList<Flight> getAllFlights()
	{
		// example:
		// ArrayList<Flight> allFlights;
		// allFlights = FlightDatabase.getAll(); 
		// return allFlights;
		
		return null;
	}
}
