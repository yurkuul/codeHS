import java.util.*;
import java.util.ArrayList;

public class CarTester
{
    public static void main(String[] args)
    {
        String model = "";
        boolean isElectric = false;
        int power = 0;
        Scanner s = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<Car>();
        System.out.println("Enter your cars' information:");
        System.out.println();
        while (true) {
            System.out.print("Model (exit to quit): ");
            model = s.nextLine();
            if (model.equals("exit")) {
                System.out.println();
                break;
            }
            System.out.println("Electric car (y/n): ");
            if (s.nextLine().equals("y")) {
                isElectric = true;
            } else {
                isElectric = false;
            }
            if (isElectric) {
                System.out.println("Percent of battery left (as a whole number): ");
                power = s.nextInt();
                s.nextLine();
            } else {
                System.out.println("Gallons of fuel left: ");
                power = s.nextInt();
                s.nextLine();
            }
            if (isElectric) {
                cars.add(new ElectricCar(model, power));
            } else {
                cars.add(new Car(model, power));
            }
            System.out.println();
        }
        
        for (Car vehicles: cars) {
            System.out.println(vehicles);
            System.out.println("Fuel Amount: " + vehicles.getFuelLevel());
            System.out.println();
        }
    }
}
