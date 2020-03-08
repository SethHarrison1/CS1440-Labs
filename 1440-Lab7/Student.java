/**
 * Student.java
 * 
 */

//Put any imports below this line.
/**
 * Short, one-line description of Student class here.
 * 
 * Optionally, include a paragraph that provides a more 
 * detailed description.
 *
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student
{
    //Put instance variables below this line.  
    private String studentName;
    private int credits;
    private double averageGrade;
    private char letterGrade;
    /**
     * No parameter constructor for objects of class Student.
     */
    public Student(String n, int c, double a)
    {
    }

    /**
     * An example of a method.  Describe this method here.
     * 
     * @return     Double the parameter and return it. 
     */
    public String getStudentName()
    {
        return studentName;
    }

    /**
     * An example of a method.  Describe this method here.
     * 
     * @return     Double the parameter and return it. 
     */
    public int getCredits()
    {
        return credits;
    }

    /**
     * An example of a method.  Describe this method here.
     * 
     * @return     Double the parameter and return it. 
     */
    public double getAverageGrade()
    {
        return averageGrade;
    }

    /**
     * An example of a method.  Describe this method here.
     * 
     * @return     Double the parameter and return it. 
     */
    public void setStudentName(String n)
    {
        studentName = n;
    }

    /**
     * An example of a method.  Describe this method here.
     * 
     * @return     Double the parameter and return it. 
     */
    public void setCredits(int c)
    {
        credits = c;
    }

    /**
     * An example of a method.  Describe this method here.
     * 
     * @return     Double the parameter and return it. 
     */
    public void setAverageGrade(double a)
    {
        averageGrade = a;
    }

    /**
     * An example of a method.  Describe this method here.
     * 
     * @return     Double the parameter and return it. 
     */
    public char letterGrade()
    {
        if (averageGrade > 89.99)
        {
            letterGrade = 'A';
            return letterGrade;
        }
        else if (averageGrade > 79.99 && averageGrade < 90)
        {
            letterGrade = 'B';
            return letterGrade;
        }
        else if (averageGrade > 69.99 && averageGrade < 80)
        {
            letterGrade = 'C';
            return letterGrade;
        }
        else if (averageGrade > 69.99 && averageGrade < 80)
        {
            letterGrade = 'D';
            return letterGrade;
        }
        else
        {
            letterGrade = 'F';
            return letterGrade;
        }
    }

    /**
     * An example of a method.  Describe this method here.
     * 
     * @param ch i
     * @return     Double the parameter and return it. 
     */
    public String hasPassed(char ch)
    {
        if (letterGrade == 'F')
        {
            System.out.print("You are failing");
        }
        else
        {
            System.out.print("You are passing");
        }
        return "ch";
    }

    /**
     * An example of a method.  Describe this method here.
     * 
     * @return     Double the parameter and return it. 
     */
    public double gradeCredits(int required)
    {
        return required;
    }
}
