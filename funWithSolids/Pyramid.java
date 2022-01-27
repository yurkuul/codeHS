import java.lang.Math;

public class Pyramid extends RectangularPrism
{
    private int length;
    private int width;
    private int height;
    
    public Pyramid(String name, int length, int width, int height) {
        super(name, length, width, height);
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    @Override
    public double volume()
    {
        return length*width*height/3.0;
    }
    
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
