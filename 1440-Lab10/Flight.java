
/**
 * Write a description of class Flight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flight
{
    // instance variables - replace the example below with your own
    private int flightNumber;
    private String destination;
    private Pilot pilot;
    private String date;

    /**
     * Constructor for objects of class Flight
     */
    public Flight()
    {
        flightNumber = 1;
        destination = "";
        pilot = new Pilot();
        date = "";
    }

    /**
     * Constructor for objects of class Flight
     */
    public Flight(int flightNumber, String destination, Pilot pilot, String date)
    {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.pilot = pilot.copy();
        this.date = date;
    }
    
    /**
     * Constructor for objects of class Flight
     */
    public int getFlightNumber()
    {
        return flightNumber;
    }
    
    /**
     * Constructor for objects of class Flight
     */
    public String getDestination()
    {
        return destination;
    }
    
    /**
     * Constructor for objects of class Flight
     */
    public Pilot getPilot()
    {
        return pilot.copy();
    }
    
    /**
     * Constructor for objects of class Flight
     */
    public String getDate()
    {
        return date;
    }
    
    /**
     * Constructor for objects of class Flight
     */
    public void setFlightNumber(int flightNumber)
    {
        this.flightNumber = flightNumber;
    }
    
    /**
     * Constructor for objects of class Flight
     */
    public void setDestination(String destination)
    {
        this.destination = destination;
    }
    
    /**
     * Constructor for objects of class Flight
     */
    public void setPilot(Pilot pilot)
    {
        this.pilot = pilot.copy();
    }
    
    /**
     * Constructor for objects of class Flight
     */
    public void setDate(String date)
    {
        this.date = date;
    }
    
    /**
     * method.
     * toString
     */
    public String toString()
    {
        return "Flt#: " + flightNumber + "\tDest: " + destination
                + "\tPlt: " + pilot.getName() + "\tDate: " + date;
    }
    
    /**
     * method.
     * copy
     */
    public Flight copy()
    {
        return new Flight(flightNumber, destination, pilot, date);
    }
}
