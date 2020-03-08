 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
 * This is the weatherMonth class.
 * @author Seth Harrison
 * @version 4/20
 */
public class WeatherMonth
{
    private int[] maxTemperature;
    private String monthName;
    private int daysInMonth;
    private int[] minTemperature;
    /**
     * no arg constructor.
     */
    public WeatherMonth()
    {
        monthName = "January";
        daysInMonth = 31;
        maxTemperature = new int[daysInMonth];
        for (int i = 0; i < maxTemperature.length; i++)
        {
            maxTemperature[i] = -999;
        }
        minTemperature = new int[daysInMonth];
        for (int i = 0; i < maxTemperature.length; i++)
        {
            minTemperature[i] = -999;
        }
    }
    
    /**
     * contructor.
     * @param monthName input
     * @param daysInMonth input
     */
    public WeatherMonth(String monthName, int daysInMonth)
    {
        this.monthName = monthName;
        this.daysInMonth = daysInMonth;
        maxTemperature = new int[daysInMonth];
        for (int i = 0; i < maxTemperature.length; i++)
        {
            maxTemperature[i] = -999;
        }
        minTemperature = new int[daysInMonth];
        for (int i = 0; i < maxTemperature.length; i++)
        {
            minTemperature[i] = -999;
        }
    }
    
    /**
     * accessor for MaxTemp.
     * @return int[]
     */
    public int[] getMaxTemperature()
    {
        return maxTemperature;
    }
    
    /**
     * accessor for monthName.
     * @return string
     */
    public String getMonthName()
    {
        return monthName;
    }
    
    /**
     * accessor for daysInMonth.
     * @return int
     */
    public int getDaysInMonth()
    {
        return daysInMonth;
    }
    
    /**
     * mutator for maxTemp.
     * @param dayOfMonth input
     * @param temperature input
     */
    public void setDayMaxTemp(int dayOfMonth, int temperature)
    {
        if (dayOfMonth >= 1 && dayOfMonth <= daysInMonth)
        {
            maxTemperature[dayOfMonth - 1] = temperature;
        }
    }
    
    /**
     * mutator for amx temp.
     * @param maxTemperature input
     */
    public void setMaxTemperature(int[] maxTemperature)
    {
        this.maxTemperature = maxTemperature;
    }
    
    /**
     * mutator for monthName.
     * @param monthName input
     */
    public void setMonthName(String monthName)
    {
        this.monthName = monthName;
    }
    
    /**
     * mutator for daysInMonth.
     * @param daysInMonth input
     */
    public void setDaysInMonth(int daysInMonth)
    {
        this.daysInMonth = daysInMonth;
    }
    
    /**
     * displays weatherMonth.
     */
    public void displayWeatherMonth()
    {
        System.out.println(monthName);
        System.out.println("Day\tMax\tMin");
        for (int day = 0; day < maxTemperature.length; day++)
        {
            System.out.println((day + 1) + "\t" + maxTemperature[day]
                + "\t" + minTemperature[day]);
        }
    }
    
    /**
     * read max temp file.
     * @param filename input
     * @throws IOException exception
     */
    public void readMaxTempFile(String filename) throws IOException
    {
        File file = new File(filename);
        Scanner sc = new Scanner(file);
        for (int i = 0; i < maxTemperature.length; i++)
        {
            int n = sc.nextInt();
            int t = sc.nextInt();
            if (n > maxTemperature.length)
            {
                break;
            }
            else
            {
                maxTemperature[n - 1] = t;
            }
        }
    }
    
    /**
     * toString method.
     * @return string
     */
    public String toString()
    {
        String month = String.format(monthName + "\n");
        String header = String.format("%3s%9s%10s\n", "Day", "Max", "Min");
        String body = "";
        for (int i = 0; i < maxTemperature.length; i++)
        {
            if (maxTemperature[i] == -999 
                && minTemperature[i] != -999)
            {
                body += String.format("%2d%10s%10d\n", i + 1, "N/A",
                    minTemperature[i]); 
            }
            else if (minTemperature[i] == -999
                && maxTemperature[i] != -999)
            {
                body += String.format("%2d%10d%10s\n", i + 1, 
                    maxTemperature[i], "N/A"); 
            }
            else if (maxTemperature[i] == -999
                && minTemperature[i] == -999)
            {
                body += String.format("%2d%10s%10s\n", i + 1, "N/A", "N/A"); 
            }
            else
            {
                body += String.format("%2d%10d%10d\n", i + 1, 
                    maxTemperature[i], minTemperature[i]);
            }
        }
        return month + header + body;
    }
    
    /**
     * get min temp.
     * @return temp
     */
    public int[] getMinTemperature()
    {
        return minTemperature;
    }
    
    /**
     * set min temp.
     * @param minTemperature input
     */
    public void setMinTemperature(int[] minTemperature)
    {
        this.minTemperature = minTemperature;
    }
    
    /**
     * set day min temp.
     * @param dayOfMonth input
     * @param temperature input
     */
    public void setDayMinTemp(int dayOfMonth, int temperature)
    {
        if (dayOfMonth >= 1 && dayOfMonth <= daysInMonth)
        {
            minTemperature[dayOfMonth - 1] = temperature;
        }
    }
    
    /**
     * read file.
     * @param filename input
     * @throws IOException exception
     */
    public void readMinTempFile(String filename) throws IOException
    {
        File file = new File(filename);
        Scanner sc = new Scanner(file);
        for (int i = 0; i < minTemperature.length; i++)
        {
            int n = sc.nextInt();
            int t = sc.nextInt();
            if (n > minTemperature.length)
            {
                break;
            }
            else
            {
                minTemperature[n - 1] = t;
            }
        }
    }
}
