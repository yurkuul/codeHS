import java.lang.Math;

public class Sphere extends Solid
{
    private int radius;
    
    public Sphere(String name, int radius) {
        super(name);
        this.radius = radius;
    }
    
    @Override
    public double volume()
    {
        return (4*Math.PI*Math.pow(radius, 3))/3;
    }
    
    @Override
    public double surfaceArea()
    {
        return 4*Math.PI*Math.pow(radius, 2);
    }
}
