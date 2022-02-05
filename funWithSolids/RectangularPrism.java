/**
 * Represents a rectangular prism that has a name. All rectangular prisms have a length, width, and height.
 * 
 * @author LZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class RectangularPrism extends Solid
{
    private int length;
    private int width;
    private int height;
    
    /**
     * Initializes a new instance of a rectangular prism with a specified name, length, width, and height.
     * 
     * @param name The specified name of the rectangular prism.
     * @param length The specified length of the rectangular prism.
     * @param width The specified width of the rectangular prism.
     * @param height The specified height of the rectangular prism.
     * @since 0.0.1
     */
    public RectangularPrism(String name, int length, int width, int height) {
        super(name);
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
        return width*height*length;
    }
    
    /**
     * @since 0.0.1
     */
    @Override
    public double surfaceArea()
    {
        return 2.0*(width*length + height*length + height*width);
    }
}
