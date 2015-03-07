package flightsearch;

import flightsearch.Flight;
import flightsearch.FlightData;
import flightsearch.FindFlights;
import java.util.ArrayList;
public class TEST {
	
	public static void main(String [] args){
		FlightData d = new FlightData();
		Flight f = d.getFligts();
		ArrayList<Flight> rightFlights = new ArrayList<Flight>();
		rightFlights.add(f);
		System.out.println(rightFlights.size());
		
		FindFlights findflights = new FindFlights();
		ArrayList<Flight> rightFlights2 = findflights.returnRightFlights("ss", "as", "sa");
		System.out.println(rightFlights2.size());
	}
}
