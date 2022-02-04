import java.lang.Math;

/**
 * Represents a pyramid that has a name. All pyramids have a length, width, and height.
 * 
 * @author LZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class Pyramid extends RectangularPrism
{
    private int length;
    private int width;
    private int height;
    
    /**
     * Initializes a new instance of a pyramid with a specified name, length, width, and height.
     * 
     * @param name The specified name of the pyramid.
     * @param length The specified length of the pyramid.
     * @param width The specified width of the pyramid.
     * @param height The specified height of the pyramid.
     * @since 0.0.1
     */
    public Pyramid(String name, int length, int width, int height) {
        super(name, length, width, height);
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    /**
     * @since 0.0.1
     */
    @Override
    public double volume()
    {
        return length*width*height/3.0;
    }
    
    /**
     * @since 0.0.1
     */
    @Override
    public double surfaceArea()
    {
        return length*width 
            + length*Math.sqrt
            (
                Math.pow(width/2.0, 2) + Math.pow(height, 2)
            )
            + width*Math.sqrt
            (
                Math.pow(length/2.0, 2) + Math.pow(height, 2)
            );
    }
}
