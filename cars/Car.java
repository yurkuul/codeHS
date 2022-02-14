/**
 * Represents a car.
 * 
 * @author LZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class Car {
    private String model;
    private int fuelLevel;
    
    /**
     * Initializes a new instance of a car with a specified model and the amount of fuel left.
     * 
     * @param model The specified model of the car.
     * @param fuelLeft The amount of fuel left in the car.
     * @since 0.0.1
     */
    public Car(String model, int fuelLeft){
        this.model = model;
        this.fuelLevel = fuelLeft;
    }
    
    /**
     * Returns the model of the car.
     * 
     * @return model The model of the car.
     * @since 0.0.1
     */
    public String getModel(){
        return model;
    }
    
    /**
     * Returns the fuel level of the car.
     * 
     * @return fuelLevel The fuel level of the car.
     * @since 0.0.1
     */
    public double getFuelLevel(){
        return fuelLevel;
    }
    
    /**
     * Returns the miles left in the car based on the mpg.
     * 
     * @return the miles left in the car.
     * @since 0.0.1
     */
    public double milesLeft(double mpg){
        return fuelLevel * mpg;
    }
    
    /**
     * Returns the model of the car with "car" after.
     * 
     * @return the model of the car with "car" after.
     * @since 0.0.1
     */
    public String toString(){
        return model + " car";
    }
}
