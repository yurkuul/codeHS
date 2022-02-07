/**
 * Represents an assignment.
 * 
 * @author LZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class Assignment
{
    String name;
    String dueDate;
    double availablePoints;
    double earnedPoints;
    
    /**
     * Initializes a new instance of an assignment with a specified name, due date, the amount of marks it is worth, and the mark that was obtained.
     * 
     * @param name The specified name of the assignment.
     * @param dueDate The specified due date of the assignment.
     * @param availablePoints The amount of points you can get on the assignment.
     * @param earnedPoints The amounts of points you earned on the assignment.
     * @since 0.0.1
     */
    public Assignment(String name, String dueDate, double availablePoints, double earnedPoints) {
        this.name = name;
        this.dueDate = dueDate;
        this.availablePoints = availablePoints;
        this.earnedPoints = earnedPoints;
    }
    
     /**
     * Sets the name of the assignment.
     * 
     * @param name The name of the assignment to be changed to.
     * @since 0.0.1
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Returns the name of the assignment.
     * 
     * @return name The name of the assignment.
     * @since 0.0.1
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the due date of the assignment.
     * 
     * @param dueDate The due date of the assignment to be changed to.
     * @since 0.0.1
     */
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
    
    /**
     * Returns the due date of the assignment.
     * 
     * @return dueDate The due date of the assignment.
     * @since 0.0.1
     */
    public String getDueDate() {
        return dueDate;
    }
    
    /**
     * Sets the available points of the assignment.
     * 
     * @param availablePoints The available points of the assignment to be changed to.
     * @since 0.0.1
     */
    public void setAvailablePoints(double availablePoints) {
        this.availablePoints = availablePoints;
    }
    
    /**
     * Returns the available points of the assignment.
     * 
     * @return availablePoints The available points of the assignment.
     * @since 0.0.1
     */
    public double getAvailablePoints() {
        return availablePoints;
    }
    
    /**
     * Sets the earned points of the assignment.
     * 
     * @param earnedPoints The earned points of the assignment to be changed to.
     * @since 0.0.1
     */
    public void setEarnedPoints(double earnedPoints) {
        this.earnedPoints = earnedPoints;
    }
    
    /**
     * Returns the earned points of the assignment.
     * 
     * @return earnedPoints The earned points of the assignment.
     * @since 0.0.1
     */
    public double getEarnedPoints() {
        return earnedPoints;
    }
}
