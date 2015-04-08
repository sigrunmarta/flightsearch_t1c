package flightsearch;
import java.sql.*;

public class BuaTilGagnagrunn
{
  public static void main( String args[] )
  {
    Connection connection = null;
    Statement statement = null;
    try {
      Class.forName("org.sqlite.JDBC");
      connection = DriverManager.getConnection("jdbc:sqlite:prufa.db");
      connection.setAutoCommit(false);
      System.out.println("Opened database successfully");
      
      statement = connection.createStatement();
      String sql = "DROP TABLE IF EXISTS Flights"; 
      statement.executeUpdate(sql);
      
      sql = "CREATE TABLE Flights " +
    		  	   "(fromAirport TEXT NOT NULL, " +
    		  	   "toAirport TEXT NOT NULL, " +
    		  	   "dateDeparture DATE NOT NULL, " +
    		  	   "dateArrival DATE NOT NULL, " +
    		  	   "timeDeparture TIME NOT NULL, " +
    		  	   "timeArrival TIME NOT NULL)";
      statement.executeUpdate(sql);
      for(int i = 0; i < 10; i++)
      {
    	  String fromAirport ="";
    	  String toAirport ="";
    	  String timeArrival="";
    	  
    	  switch(i){
    	  case 0:	fromAirport = "KEF";
    	  			toAirport = "LHR";
    	  			timeArrival = "13:00:00"; 
    	  			break;
    	  case 1:	fromAirport = "KEF";
					toAirport = "CPH";
					timeArrival = "13:00:00"; 
					break;
    	  case 2:	fromAirport = "KEF";
		    	    toAirport = "BOS";
					timeArrival = "15:00:00"; 
					break;
    	  case 3:	fromAirport = "Copenhagen";
					toAirport = "PEK";
					timeArrival = "20:00:00"; 
					break;
    	  case 4:	fromAirport = "RVK";
					toAirport = "AK";
					timeArrival = "10:30:00"; 
					break;
    	  case 5:	fromAirport = "LHR";
					toAirport = "KEF";
					timeArrival = "13:00:00"; 
					break;
    	  case 6:	fromAirport = "CPH";
					toAirport = "KEF";
					timeArrival = "13:00:00"; 
					break;
    	  case 7:	fromAirport = "BOS";
    	  			toAirport = "KEF";
					timeArrival = "15:00:00"; 
					break;
    	  case 8:	fromAirport = "PEK";
					toAirport = "CPH";
					timeArrival = "20:00:00"; 
					break;
    	  case 9:	fromAirport = "AK";
					toAirport = "RVK";
					timeArrival = "10:30:00"; 
					break;
    	  }
    	  for(int day = 1; day <= 31; day++)
    	  {
    	  String sDay = String.valueOf(day);
		  String dagsetning;
		  if(day < 10)
		  {
			  dagsetning = "2015-03-0" + sDay;
		  }
		  else
		  {
			  dagsetning = "2015-03-" + sDay;
		  }
		  PreparedStatement stmt = connection.prepareStatement("INSERT INTO Flights (fromAirport, toAirport, dateDeparture, dateArrival, timeDeparture, timeArrival)" + 
		  	    "VALUES (?, ?, ?, ?, '10:00:00', ?)");
			  stmt.setString(1, fromAirport);
			  stmt.setString(2, toAirport);
			  stmt.setString(3, dagsetning);
			  stmt.setString(4, dagsetning);
			  stmt.setString(5, timeArrival);
			  stmt.executeUpdate();
		      stmt.close();
		  }
      }
      
      
      statement.close();
      connection.commit();
      connection.close();
      
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println("It Works! :D");

  }
}