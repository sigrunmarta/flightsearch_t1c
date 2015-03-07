package flightsearch;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import flightsearch.Flight;
import flightsearch.FindFlights;


public class FindFlightsTest {
	
	private ArrayList<Flight> flight;

	@Before
	public void setUp() throws Exception {
		
		Flight f = new Flight("KEF", "LON", "2015-03-30", "2015-03-30", "10:00:00", "15:00:00", 153, 6500, 3);
		flight.add(f);
		
	}

	@After
	public void tearDown() throws Exception {
		flight = null;
	}

	@Test
	public void testReturnRightFlights() {
		FindFlights findFlights = new FindFlights();

		ArrayList<Flight> rightFlights = findFlights.returnRightFlights("2015-03-30", "KEF", "LON");
		System.out.println(rightFlights.size());
		assertTrue(flight.size() == rightFlights.size());
		
	}

}
