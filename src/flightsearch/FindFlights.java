package flightsearch;

import java.util.ArrayList;

public class FindFlights {
	private ArrayList<Flight> flights;
	
	public void flaggaflu(){
	Flight f1 = new Flight("KEF", "BEI", "2015-03-30", "2015-03-31", "10:00:00", "23:00:00", 2, 12000, 1);
	Flight f2 = new Flight("KEF", "DEN", "2015-03-30", "2015-03-30", "10:00:00", "18:00:00", 46, 8000, 2);
	Flight f3 = new Flight("KEF", "LON", "2015-03-30", "2015-03-30", "10:00:00", "15:00:00", 153, 6500, 3);
	Flight f4 = new Flight("KEF", "BOS", "2015-03-30", "2015-03-30", "10:00:00", "16:00:00", 18, 7000, 4);

	flights.add(f1);
	flights.add(f2);
	flights.add(f3);
	flights.add(f4);
	
	
	System.out.print(flights);
	}

}
