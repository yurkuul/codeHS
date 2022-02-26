import java.util.Scanner;

/**
 * Represents a bacteria.
 * 
 * @author LZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class Bacteria
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many hours will the bacteria breed? ");
        int hours = input.nextInt();
        int bacteria = colonySize(hours);
        System.out.println("After " + hours + " hours, there will be " + bacteria);
    }
    
    /**
    *  Recursive method that calculates the amount of bacteria grown in a 
    *  specified amount of hours with 7 bacteria at the 0th hour. Each hour, the
    *  number of bacteria multiplies by 4.
    *
    *  @Param hour The number of hours the bacteria is left to cultivate for.
    *  @return The number of bacteria grown from the hours inputted.
    *  @since 0.0.1
    */
    public static int colonySize(int hour)
    {
        if (hour == 0) {
            return 7;
        } else {
            return colonySize(hour-1) + colonySize(hour-1)*4;
        }
    }
}
