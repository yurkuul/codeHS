/**
 * Represents an electric car.
 * 
 * @author LZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class ElectricCar extends Car {
    /**
     * Initializes a new instance of an electric car with a specified model and battery level.
     * 
     * @param model The specified model of the car.
     * @param batteryLevel The battery level of the car.
     * @since 0.0.1
     */
    public ElectricCar(String model, int batteryLevel){
       super(model, batteryLevel);
    }
  
    /**
     * @since 0.0.1
     */
    @Override
    public double getFuelLevel(){
        return super.getFuelLevel();
    }
    
    /**
     * Returns the miles left in the electric car.
     * 
     * @return the miles left in the electric car.
     * @since 0.0.1
     */
    public double milesLeft(int totalMiles){
        return getFuelLevel()*totalMiles;
    }
    
    /**
     * @since 0.0.1
     */
    @Override
    public String toString(){
        return getModel() + " electric car";
    }
}
