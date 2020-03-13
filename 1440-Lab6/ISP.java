
/**
 * Write a description of class ISP here.
 * 
 * @author Seth Harrison 
 * @version 3/19/19
 */
public class ISP
{
    private char pkg;
    private double hoursUsed;
    private double charges;
    /**
     * An example of a method.  Describe this method here
     * 
     * 
     */
    public ISP()
    {
        pkg = 'A';
        hoursUsed = 0;
    }

    /**
     * constructor
     * 
     * @param pkg p
     * @parak hoursUsed h
     * 
     */
    public ISP(char p, double h)
    {
        pkg = p;
        hoursUsed = h;
    }

    /**
     * An example of a method.  Describe this method here
     * 
     * @return pkg
     */
    public char getPkg()
    {
        return pkg;
    }

    /**
     * An example of a method.  Describe this method here
     * 
     * @return hoursUsed
     */
    public double getHoursUsed()
    {
        return hoursUsed;
    }

    /**
     * An example of a method.  Describe this method here
     * 
     * @param newPkg A sample paramater for this input
     */
    public void setPkg(char newPkg)
    {
        pkg = newPkg;
    }

    /**
     * An example of a method.  Describe this method here
     * 
     * @param hoursUsed input
     */
    public void setHoursUsed(double newHoursUsed)
    {
        hoursUsed = newHoursUsed;
    }

    public double calculateCharges()
    {
        if (pkg == 'A')
        {
            if (hoursUsed <= 10)
            {
                charges = 9.95;
                return charges;
            }
            charges = 9.95 + (2 * (hoursUsed - 10));
            return charges;
        }
        else if (pkg == 'B')
        {
            if (hoursUsed <= 20)
            {
                charges = 14.95;
                return charges;
            }
            charges = 14.95 + (1 * (hoursUsed - 20));
            return charges;
        }
        else if (pkg == 'C')
        {
            charges = 19.95;
            return charges;
        }
        System.out.println("Invalid Package");
        return charges;
    }
    
    /**
     * 
     */
    public double printSavings()
    {
        double savings = 0;
        if (pkg == 'A')
        {
            if (charges < 19.95 && charges > 14.95)
            {
                savings = charges - 14.95 + ((1 * (hoursUsed - 20)));
                System.out.println("You would have saved $" + savings
                                    + " by choosing package B");
            }
            else if (charges > 19.95)
            {
                savings = charges - 19.95;
                System.out.println("You would have saved $" + savings
                                    + " by choosing package C");
            }
        }
        else if (pkg == 'B')
        {
            if (charges > 19.95)
            {
                savings = charges - 19.95;
                System.out.println("You would have saved $" + savings
                                    + " by choosing package C");
            }
        }
        return savings;
    }
}

