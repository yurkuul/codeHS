public class Test extends Assignment {
    String testType;
    
    public Test(String name, String dueDate, double availablePoints, double earnedPoints, String testType) {
        super(name, dueDate, availablePoints, earnedPoints);
        this.testType = testType;
    }
    
    public String getTestType() {
        return testType;
    }
    
    public void setTestType(String testType) {
        this.testType = testType;
    }
}
