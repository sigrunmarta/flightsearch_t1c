package flightsearch;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import flightsearch.Flight;
import flightsearch.FindFlights;

public class FindFlightsTest {
	
	private ArrayList<Flight> flights;
	private FindFlights findFlights = new FindFlights();

	@Before
	public void setUp() throws Exception {
		
		flights = new ArrayList<Flight>();
		
		Flight f1 = new Flight("KEF", "BEI", "2015-03-30", "2015-03-31", "10:00:00", "23:00:00", 2, 12000, 1);
		Flight f2 = new Flight("KEF", "DEN", "2015-03-30", "2015-03-30", "10:00:00", "18:00:00", 46, 8000, 2);
		Flight f3 = new Flight("KEF", "LON", "2015-03-30", "2015-03-30", "10:00:00", "15:00:00", 153, 6500, 3);
		Flight f4 = new Flight("KEF", "BOS", "2015-03-30", "2015-03-30", "10:00:00", "16:00:00", 18, 7000, 4);

		flights.add(f1);
		flights.add(f2);
		flights.add(f3);
		flights.add(f4);
		
	}

	@After
	public void tearDown() throws Exception {
		flights = null;
	}

	@Test
	public void testGetFlightsFromTo(){
		
		String departure = "KEF";
		String arrival = "DEN";
		int correct_id = 2;
		
		ArrayList<Flight> testFlights = new ArrayList<Flight>();
		
		testFlights = findFlights.getFlightsFromTo(flights,departure, arrival);
		
		assertEquals(correct_id, testFlights.get(0).getFlightNumber());
	}
	
	@Test
	public void testGetFlightsDepartureArrival(){
		
		String departure = "2015-03-30";
		String arrival = "2015-03-31";
		int correct_id = 1;
		
		ArrayList<Flight> testFlights = new ArrayList<Flight>();
		
		testFlights = findFlights.getFlightsDepartureArrival(flights, departure, arrival);
		
		assertEquals(correct_id, testFlights.get(0).getFlightNumber());
	}
}
