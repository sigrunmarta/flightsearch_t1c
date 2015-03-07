package flightsearch;

import java.util.ArrayList;

import flightsearch.Flight;

public class FindFlights {
	
	public ArrayList<Flight> returnRightFlights (String date, String departureAirport, String arrivalAirport){
		FlightData d = new FlightData();
		Flight f = d.getFligts();
		ArrayList<Flight> rightFlights = new ArrayList<Flight>();
		rightFlights.add(f);
		
		return rightFlights;
	}

}
