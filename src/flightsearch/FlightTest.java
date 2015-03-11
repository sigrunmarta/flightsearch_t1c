package flightsearch;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FlightTest {

	private Flight flightToTest;
	

	private String fromAirport = "KEF";
	private String toAirport = "DEN";
	private String dateDeparture = "2015-03-30";
	private String dateArrival = "2015-03-31"; 
	private String timeDeparture = "10:00:00";
	private String timeArrival = "10:30:00";
	private int availableSeats = 50;
	private int price = 150;
	private int flightNumber = 671;
	
	@Before
	public void setUp() throws Exception {
		flightToTest = new Flight(fromAirport, toAirport, 
									dateDeparture, dateArrival, 
									timeDeparture, timeArrival, 
									availableSeats, price, flightNumber);
	}

	@After
	public void tearDown() throws Exception {
		flightToTest = null;
		String fromAirport = null;
		String toAirport = null;
		String dateDeparture = null;
		String dateArrival = null;
		String timeDeparture = null;
		String timeArrival = null;
		int availableSeats = 0;
		int price = 0;
		int flightNumber = 0;
	}

	@Test
	public void testGetFromAirport() {
		assertEquals(fromAirport, flightToTest.getFromAirport());
		assertNotEquals("ble", flightToTest.getFromAirport());
	}

	@Test
	public void testSetFromAirport() {
		flightToTest.setFromAirport("LON");
		assertEquals("LON", flightToTest.getFromAirport());
	}

	@Test
	public void testGetToAirport() {
		assertEquals(toAirport, flightToTest.getToAirport());
		
	}

	@Test
	public void testGetDateDeparture() {
		assertEquals(dateDeparture, flightToTest.getDateDeparture());
	}

	@Test
	public void testGetDateArrival() {
		assertEquals(dateArrival, flightToTest.getDateArrival());
	}

	@Test
	public void testGetTimeDeparture() {
		assertEquals(timeDeparture, flightToTest.getTimeDeparture());
	}

	@Test
	public void testGetTimeArrival() {
		assertEquals(timeArrival, flightToTest.getTimeArrival());
	}

	@Test
	public void testGetAvailableSeats() {
		assertEquals(availableSeats, flightToTest.getAvailableSeats());
	}

	@Test
	public void testGetPrice() {
		assertEquals(price, flightToTest.getPrice());
	}

	@Test
	public void testGetFlightNumber() {
		assertEquals(flightNumber, flightToTest.getFlightNumber());
	}
}