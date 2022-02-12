public class Car {
    private String model;
    private int fuelLevel;
    
    public Car(String model, int fuelLeft){
        this.model = model;
        this.fuelLevel = fuelLeft;
    }
    
    public String getModel(){
        return model;
    }
    
    public double getFuelLevel(){
        return fuelLevel;
    }
  
    public double milesLeft(double mpg){
        return fuelLevel * mpg;
    }
    
    public String toString(){
        return model + " car";
    }
}
