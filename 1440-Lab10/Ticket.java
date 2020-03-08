
/**
 * Write a description of class Ticket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ticket
{
    // instance variables - replace the example below with your own
    private Customer customer;
    private Flight flight;

    /**
     * Constructor for objects of class Ticket
     */
    public Ticket(Customer customer, Flight flight)
    {
        this.customer = new Customer(customer.getName(), customer.getSsn());
        this.flight = flight.copy();
    }

    /**
     * Constructor for objects of class Ticket
     */
    public Customer getCustomer()
    {
        return new Customer(customer.getName(), customer.getSsn());
    }

    /**
     * Constructor for objects of class Ticket
     */
    public Flight getFlight()
    {
        return flight.copy();
    }

    /**
     * Constructor for objects of class Ticket
     */
    public void setCustomer(Customer customer)
    {
        this.customer = new Customer(customer.getName(), customer.getSsn());
    }
    
    /**
     * Constructor for objects of class Ticket
     */
    public void setFlight(Flight flight)
    {
        this.flight = flight.copy();
    }
    
    /**
     * Constructor for objects of class Ticket
     */
    public String toString()
    {
        return "******** TICKET ********\n"
                + "* Name: " + customer.getName() + "\n"
                + "* SSN: " + customer.getSsn() + "\n"
                + "* Flight: " + flight.getFlightNumber() + "\n"
                + "* Date: " + flight.getDate() + "\n"
                + "* Destination: " + flight.getDestination() + "\n"
                + "************************";
    }
}
