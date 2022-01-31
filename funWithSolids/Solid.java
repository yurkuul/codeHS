/**
 * Represents a solid.
 * 
 * @author LZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class Solid
{
    private String myName;
    
    /**
     * Initializes a new instance of a solid with a specified name.
     * 
     * @param name The specified name of the solid.
     * @since 0.0.1
     */
    public Solid(String name)
    {
        myName = name;
    }
    
    /**
     * Returns the name of the solid.
     * 
     * @return myName The name of the solid.
     * @since 0.0.1
     */
    public String getName()
    {
        return myName;
    }
    
    /**
     * Returns the volume of the solid.
     * 
     * @return 0 The default volume for a solid.
     * @since 0.0.1
     */
    public double volume()
    {
        return 0;
    }
    
    /**
     * Returns the surface area of the solid.
     * 
     * @return 0 The default surface area for a solid.
     * @since 0.0.1
     */
    public double surfaceArea()
    {
        return 0;
    }
}
