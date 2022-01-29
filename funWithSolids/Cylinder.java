import java.lang.Math;

public class Cylinder extends Solid
{
    private String name;
    private int radius;
    private int height;
    
    public Cylinder(String name, int radius, int height) {
        super(name);
        this.radius = radius;
        this.height = height;
    }
    
    @Override
    public double volume()
    {
        return Math.PI*Math.pow(radius, 2)*height;
    }
    
    @Override
    public double surfaceArea()
    {
        return 2*Math.PI*radius*height + 2*Math.PI*Math.pow(radius, 2);
    }
}
