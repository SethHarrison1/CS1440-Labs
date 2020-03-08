/**
 * Pilot.java
 * 
 */

//Put any imports below this line.
/**
 * Short, one-line description of Pilot class here.
 * 
 * Optionally, include a paragraph that provides a more 
 * detailed description.
 *
 * @author (your name)  
 * @version (a version number or a date)    
 */     
public class Pilot  
{
    private String name;
    private String license;
    /**
     * Constructer for pilot.
     */
    public Pilot()
    {
        name = "";
        license = "";
    }

    /**
     * Constructer for pilot - overloaded.
     * @param name String
     * @param license String
     */
    public Pilot(String name, String license)
    {
        this.name = name;
        this.license = license;
    }

    /** 
     * method.  
     * @param name setName  
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
     * method.
     * @param license setLicense
     */
    public void setLicense(String license)
    {
        if (license == null)
        {
            license = "";
        }
        this.license = license;
    }

    /**
     * Constructer for pilot.
     * @return name
     */
    public String getName()
    {
        return name;
    }

    /**
     * method.
     * @return license
     */
    public String getLicense()  
    {   
        return license;
    }

    /**
     * method.
     * @return pilot pilot
     */
    public Pilot copy()
    {
        return new Pilot(name, license);
    }

    /**
     * method.
     * @return str String
     */
    public String toString()
    {
        String str = "Name: " + name + " - License: " + license;
        return str;
    }   

    /** 
     * method.  
     * @param pilot Pilot   
     * @return boolean huh      
     */     
    public boolean equals(Pilot pilot)      
    {   
        return name.equals(pilot.name)
        && license.equals(pilot.license);
    }
}