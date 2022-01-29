public class Cube extends RectangularPrism
{
    private int sideLength;
    
    public Cube(String name, int sideLength) {
        super(name, sideLength, sideLength, sideLength);
        this.sideLength = sideLength;
    }
    
    @Override
    public double volume()
    {
        return Math.pow(sideLength, 3);
    }
    
    @Override
    public double surfaceArea()
    {
        return 6*Math.pow(sideLength, 2);
    }
}
