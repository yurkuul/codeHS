import java.util.*;

public class AssignmentRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = "";
        String dueDate = "";
        double availablePoints = 0.0;
        double earnedPoints = 0.0;
        String testType = "";
        boolean groups = false;
        boolean presentations = false;
        ArrayList<Assignment> assignments = new ArrayList<Assignment>();
        
        while (true) {
            System.out.print("Enter the assignment's name (exit to quit): ");
            name = s.nextLine();
            
            if (name.equals("exit")) {
                break;
            }
            
            System.out.print("How many points is the assignment worth? ");
            availablePoints = s.nextDouble();
            
            s.nextLine();
            
            System.out.print("How many points were earned? ");
            earnedPoints = s.nextDouble();
            
            s.nextLine();
            
            System.out.print("Is this a (T)est or a (P)roject? ");
            String type = s.nextLine();
            
            if (type.equals("T")) {
                System.out.print("What type of test is it? ");
                testType = s.nextLine();
                assignments.add(new Test(name, dueDate, availablePoints, earnedPoints, testType));
            } else {
                System.out.println("Does this project require (true/false) ... ");
                System.out.print("Groups? ");
                String check = s.nextLine();
                if (check.equals("true")) {
                    groups = true;
                }
                System.out.print("A presentation? ");
                check = s.nextLine();
                if (check.equals("true")) {
                    presentations = true;
                }
                assignments.add(new Project(name, dueDate, availablePoints, earnedPoints, groups, presentations));
            }
            System.out.println();
        }
        printSummary(assignments);
    }

    // Print due date and score percentage on the assignment
    public static void printSummary(ArrayList<Assignment> assignments) {
        for (int i = 0; i < assignments.size(); i++) {
            System.out.println(assignments.get(i).getName() + " - " + (assignments.get(i).getEarnedPoints()/assignments.get(i).getAvailablePoints()*100));
        }
    }
}
