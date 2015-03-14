package flightsearch;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FlightT {

	private String fromAirport;
	private String toAirport;
	private Date dateTimeDeparture;
	private Date dateTimeArrival;
	private int availableSeats;
	private int price;
	private String flightNumber;
	
	// Constructor for Flight
	public FlightT(String fromAirport, String toAirport, String dateTimeDeparture,
			String dateTimeArrival, int availableSeats, int price, String flightNumber) {
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
		this.fromAirport = fromAirport;
		this.toAirport = toAirport;
		try {
			this.dateTimeDeparture = ft.parse(dateTimeDeparture);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			this.dateTimeArrival = ft.parse(dateTimeArrival);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.availableSeats = availableSeats;
		this.price = price;
		this.flightNumber = flightNumber;
	}

	public String getFromAirport() {
		return fromAirport;
	}

	public void setFromAirport(String fromAirport) {
		this.fromAirport = fromAirport;
	}

	public String getToAirport() {
		return toAirport;
	}

	public void setToAirport(String toAirport) {
		this.toAirport = toAirport;
	}

	public Date getDateTimeDeparture() {
		return dateTimeDeparture;
	}

	public void setDateTimeDeparture(String dateTimeDeparture) {
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
		try {
			this.dateTimeDeparture = ft.parse(dateTimeDeparture);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Date getDateTimeArrival() {
		return dateTimeArrival;
	}

	public void setDateTimeArrival(String dateTimeArrival) {
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
		try {
			this.dateTimeArrival = ft.parse(dateTimeArrival);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
}
