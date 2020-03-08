
/**
 * Write a description of class Customer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private String name;
    private String ssn;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(String name, String ssn)
    {
        if (name == null)
        {
            name = "";
        }
        this.name = name;
        if (ssn == null)
        {
            ssn = "";
        }
        this.ssn = ssn;
    }

    /**
     * Constructor for objects of class Customer
     */
    public Customer(Customer customer)
    {
        name = customer.name;
        ssn = customer.ssn;
    }
    
    /**
     * Constructor for objects of class Customer
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Constructor for objects of class Customer
     */
    public String getSsn()
    {
        return ssn;
    }
    
    /**
     * Constructor for objects of class Customer
     */
    public void setName(String name)
    {
        if (name == null)
        {
            name = "";
        }
        this.name = name;
    }
    
    /**
     * Constructor for objects of class Customer
     */
    public void setSsn(String ssn)
    {
        if (ssn == null)
        {
            this.ssn = "";
        }
        this.ssn = ssn;
    }
    
    public String toString()
    {
        return "Name: " + name + " - SSN: " + ssn;
    }
}
