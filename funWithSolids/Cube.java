/**
 * Represents a cube that has a name. All cubes have equal side lengths. 
 * 
 * @author LZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class Cube extends RectangularPrism
{
    private int sideLength;
    
    /**
     * Initializes a new instance of a cube with a specified name and side length.
     * 
     * @param name The specified name of the cube.
     * @param sideLength The specified side length of the cube.
     * @since 0.0.1
     */
    public Cube(String name, int sideLength) {
        super(name, sideLength, sideLength, sideLength);
        this.sideLength = sideLength;
    }
    
    /**
     * @since 0.0.1
     */
    @Override
    public double volume()
    {
        return Math.pow(sideLength, 3);
    }
    
    /**
     * @since 0.0.1
     */
    @Override
    public double surfaceArea()
    {
        return 6*Math.pow(sideLength, 2);
    }
}
