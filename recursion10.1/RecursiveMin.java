import java.util.*;

/**
 * Represents a recursive way of finding the minimum in an ArrayList.
 * 
 * @author LZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class RecursiveMin
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while (true){
             System.out.println("Please enter numbers. Enter -1 to quit: ");
             int number = input.nextInt();
             if (number == -1){
                 break;
             }
             else {
                 numbers.add(number);
             }
        }
        int minimum = findMinimum(numbers);
        System.out.println("Minimum: " + minimum);
    }
    
    /**
    *  Recursive method that finds the minimum from an ArrayList of
    *  numbers. 
    *
    *  @Param numbers The ArrayList used to find the minimum recursively.
    *  @return The minimum value found in the ArrayList.
    *  @since 0.0.1
    */
    public static int findMinimum(ArrayList<Integer> numbers)
    {
        if (numbers.size() == 1) {
            return numbers.get(0);
        }
        if (numbers.get(numbers.size()-1) > numbers.get(numbers.size()-2)) {
            numbers.remove(numbers.size()-1);
            return findMinimum(numbers);
        } else {
            numbers.remove(numbers.size()-2);
            return findMinimum(numbers);
        }
    }
}
