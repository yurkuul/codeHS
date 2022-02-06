public class Assignment
{
    String name;
    String dueDate;
    double availablePoints;
    double earnedPoints;
    
    public Assignment(String name, String dueDate, double availablePoints, double earnedPoints) {
        this.name = name;
        this.dueDate = dueDate;
        this.availablePoints = availablePoints;
        this.earnedPoints = earnedPoints;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
    
    public String getDueDate() {
        return dueDate;
    }
    
    public void setAvailablePoints(double availablePoints) {
        this.availablePoints = availablePoints;
    }
    
    public double getAvailablePoints() {
        return availablePoints;
    }
    
    public void setEarnedPoints(double earnedPoints) {
        this.earnedPoints = earnedPoints;
    }
    
    public double getEarnedPoints() {
        return earnedPoints;
    }
}
