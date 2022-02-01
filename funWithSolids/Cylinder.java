import java.lang.Math;

/**
 * Represents a cylinder that has a name. All cylinders have a radius and a height.
 * 
 * @author LZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class Cylinder extends Solid
{
    private String name;
    private int radius;
    private int height;
    
    /**
     * Initializes a new instance of a cylinder with a specified name, radius, and height.
     * 
     * @param name The specified name of the cylinder.
     * @param radius The specified radius of the cylinder.
     * @param height The specified height of the cylinder.
     * @since 0.0.1
     */
    public Cylinder(String name, int radius, int height) {
        super(name);
        this.radius = radius;
        this.height = height;
    }
    
    /**
     * @since 0.0.1
     */
    @Override
    public double volume()
    {
        return Math.PI*Math.pow(radius, 2)*height;
    }
    
    /**
     * @since 0.0.1
     */
    @Override
    public double surfaceArea()
    {
        return 2*Math.PI*radius*height + 2*Math.PI*Math.pow(radius, 2);
    }
}
