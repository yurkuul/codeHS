public class Project extends Assignment {
    boolean groups;
    boolean presentations;
    
    public Project(String name, String dueDate, double availablePoints, double earnedPoints, boolean hasGroups, boolean hasPresentation) {
        super(name, dueDate, availablePoints, earnedPoints);
        groups = hasGroups;
        presentations = hasPresentation;
    }
    
    public boolean hasGroups() {
        return groups;
    }
    
    public void setGroups(boolean hasGroups) {
        groups = hasGroups;
    }
    
    public boolean hasPresentation() {
        return presentations;
    }
    
    public void setPresentation(boolean hasPresentations) {
        presentations = hasPresentations;
    }
}
