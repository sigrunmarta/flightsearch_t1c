package flightsearch;

import java.util.ArrayList;

import flightsearch.Flight;

public class FindFlights {
	private FlightData flightData;
	
	public ArrayList<Flight> returnRightFlights (String date, String departureAirport, String arrivalAirport){
	
		ArrayList<Flight> rightFlights = new ArrayList<Flight>();
		rightFlights.add(flightData.returnData());
		
		return rightFlights;
	}

}
