public class RectangularPrism extends Solid
{
    private int length;
    private int width;
    private int height;
    
    public RectangularPrism(String name, int length, int width, int height) {
        super(name);
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    @Override
    public double volume()
    {
        return width*height*length;
    }
    
    @Override
    public double surfaceArea()
    {
        return 2.0*(width*length + height*length + height*width);
    }
}
