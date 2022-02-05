import java.lang.Math;

/**
 * Represents a sphere that has a name. All spheres have a radius.
 * 
 * @author LZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class Sphere extends Solid
{
    private int radius;
    
    /**
     * Initializes a new instance of a sphere with a specified name and radius.
     * 
     * @param name The specified name of the sphere.
     * @param radius The specified radius of the sphere.
     * @since 0.0.1
     */
    public Sphere(String name, int radius) {
        super(name);
        this.radius = radius;
    }
    
    /**
     * @since 0.0.1
     */
    @Override
    public double volume()
    {
        return (4*Math.PI*Math.pow(radius, 3))/3;
    }
    
    /**
     * @since 0.0.1
     */
    @Override
    public double surfaceArea()
    {
        return 4*Math.PI*Math.pow(radius, 2);
    }
}
