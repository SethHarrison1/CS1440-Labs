/**
 * StudentDemo.java
 * 
 */


//Put any imports below this line.
 import java.util.Scanner;
 
/**
 * Short, one-line description of StudentDemo class here.
 * 
 * Optionally, include a paragraph that provides a more 
 * detailed description.
 *
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StudentDemo
{
    //Put instance variables below this line.  
    
    
    /**
     * No parameter constructor for objects of class StudentDemo.
     */
    public StudentDemo()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Student name: ");
        String studentName = kb.nextLine();
        System.out.println("Credits: ");
        int credits = kb.nextInt();
        System.out.println("Average Grade: ");
        double averageGrade = kb.nextDouble();
        System.out.println("Required Credits: ");
        int required = kb.nextInt();
        Student demo = new Student(studentName, credits, averageGrade);
        System.out.println("Hello " + studentName + ", your current grade is "
                            + Student.letterGrade() + "." + Student.hasPassed()
                            + "." + "You currently have " + credits + " credits");
                            
    }
    

}
