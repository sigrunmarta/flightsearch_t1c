package flightsearch;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FlightTestT {

	private FlightT flightToTest;
	

	private String fromAirport;
	private String toAirport;
	private String dateTimeDeparture;
	private String dateTimeArrival; 
	private int availableSeats;
	private int price;
	private String flightNumber;
	
	@Before
	public void setUp() throws Exception {
		fromAirport = "KEF";
		toAirport = "DEN";
		dateTimeDeparture = "2015-03-30 10:00:00";
		dateTimeArrival = "2015-03-31 10:30:00"; 
		availableSeats = 50;
		price = 150;
		flightNumber = "FI521";
		flightToTest = new FlightT(fromAirport, toAirport, 
				dateTimeDeparture, dateTimeArrival,	availableSeats, price, flightNumber);
	}

	@After
	public void tearDown() throws Exception {
		flightToTest = null;
		fromAirport = null;
	    toAirport = null;
		dateTimeDeparture = null;
		dateTimeArrival = null;
		availableSeats = 0;
		price = 0;
		flightNumber = null;
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
	public void testSetToAirport() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDateTimeDeparture() {
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
		assertEquals(dateTimeDeparture, ft.format(flightToTest.getDateTimeDeparture()));
	}

	@Test
	public void testSetDateTimeDeparture() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDateTimeArrival() {
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
		assertEquals(dateTimeArrival, ft.format(flightToTest.getDateTimeArrival()));
	}

	@Test
	public void testSetDateTimeArrival() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAvailableSeats() {
		assertEquals(availableSeats, flightToTest.getAvailableSeats());
	}

	@Test
	public void testSetAvailableSeats() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPrice() {
		assertEquals(price, flightToTest.getPrice());
	}

	@Test
	public void testSetPrice() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFlightNumber() {
		assertEquals(flightNumber, flightToTest.getFlightNumber());
	}

	@Test
	public void testSetFlightNumber() {
		fail("Not yet implemented");
	}

	@Test
	public void testObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	public void testClone() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testWait() {
		fail("Not yet implemented");
	}

	@Test
	public void testFinalize() {
		fail("Not yet implemented");
	}

}

