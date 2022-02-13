public class ElectricCar extends Car {
  
    public ElectricCar(String model, int batteryLevel){
       super(model, batteryLevel);
    }

    @Override
    public double getFuelLevel(){
        return super.getFuelLevel();
    }

    public double milesLeft(int totalMiles){
        return getFuelLevel()*totalMiles;
    }

    @Override
    public String toString(){
        return getModel() + " electric car";
    }
}
