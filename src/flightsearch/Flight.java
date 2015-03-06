package flightsearch;

public class Flight {

	private String fromAirport;
	private String toAirport;
	private String dateDeparture;
	private String dateArrival;
	private String timeDeparture;
	private String timeArrival;
	private int availableSeats;
	private int price;
	private int flightNumber;
	
	// Constructor for Flight
	public Flight(String fromAirport, String toAirport, String dateDeparture,
			String dateArrival, String timeDeparture, String timeArrival,
			int availableSeats, int price, int flightNumber) {
		super();
		this.fromAirport = fromAirport;
		this.toAirport = toAirport;
		this.dateDeparture = dateDeparture;
		this.dateArrival = dateArrival;
		this.timeDeparture = timeDeparture;
		this.timeArrival = timeArrival;
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

	public String getDateDeparture() {
		return dateDeparture;
	}

	public void setDateDeparture(String dateDeparture) {
		this.dateDeparture = dateDeparture;
	}

	public String getDateArrival() {
		return dateArrival;
	}

	public void setDateArrival(String dateArrival) {
		this.dateArrival = dateArrival;
	}

	public String getTimeDeparture() {
		return timeDeparture;
	}

	public void setTimeDeparture(String timeDeparture) {
		this.timeDeparture = timeDeparture;
	}

	public String getTimeArrival() {
		return timeArrival;
	}

	public void setTimeArrival(String timeArrival) {
		this.timeArrival = timeArrival;
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

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
}
