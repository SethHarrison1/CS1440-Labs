import java.util.Scanner;
/**
 * Write a description of class ISPMain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ISPMain
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Package A: For $9.95 per month,"
        + " 10 hours of access are provided." 
        + " Additional hours are $2.00 per hour.");
        System.out.println("Package B: For $14.95 per month," 
        + " 20 hours of access are provided." 
        + " Additional hours are $1.00 per hour.");
        System.out.println("Package C: For $19.95 per month,"
        + "unlimited access is provided");
        System.out.println("Select Package: ");
        double hoursUsed = 0;
        char pkg = kb.nextLine().toUpperCase().charAt(0);
        if (pkg == 'A')
        {
            System.out.println("Input Hours Used: ");
            hoursUsed = kb.nextDouble();
        }
        else if (pkg == 'B')
        {
            System.out.println("Input Hours Used: ");
            hoursUsed = kb.nextDouble();
        }
        ISP IDK = new ISP(pkg, hoursUsed);
        System.out.println(IDK.calculateCharges());
        System.out.println(IDK.printSavings());
    }
}
