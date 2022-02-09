/**
 * Represents a test.
 * 
 * @author LZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class Test extends Assignment {
    String testType;
    
    /**
     * Initializes a new instance of a test with a specified name, due date, the amount of marks it is worth, the mark that was obtained,
     * and the type of test.
     * 
     * @param name The specified name of the test.
     * @param dueDate The specified due date of the test.
     * @param availablePoints The amount of points you can get on the test.
     * @param earnedPoints The amounts of points you earned on the test.
     * @param testType The type of test this is.
     * @since 0.0.1
     */
    public Test(String name, String dueDate, double availablePoints, double earnedPoints, String testType) {
        super(name, dueDate, availablePoints, earnedPoints);
        this.testType = testType;
    }
    
    /**
     * Returns the type of test this is.
     * 
     * @return testType The type of test this is.
     * @since 0.0.1
     */
    public String getTestType() {
        return testType;
    }
    
    /**
     * Sets the type of test.
     * 
     * @param testType The type of test.
     * @since 0.0.1
     */
    public void setTestType(String testType) {
        this.testType = testType;
    }
}
