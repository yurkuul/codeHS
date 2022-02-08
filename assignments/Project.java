/**
 * Represents a project.
 * 
 * @author LZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class Project extends Assignment {
    boolean groups;
    boolean presentations;
    
    /**
     * Initializes a new instance of a project with a specified name, due date, the amount of marks it is worth, the mark that was obtained,
     * whether or not the project contains groups, and if there is a presentation.
     * 
     * @param name The specified name of the project.
     * @param dueDate The specified due date of the project.
     * @param availablePoints The amount of points you can get on the project.
     * @param earnedPoints The amounts of points you earned on the project.
     * @param hasGroups Whether the project has groups or not.
     * @param hasPresentation Whether the project has a presentation or not.
     * @since 0.0.1
     */
    public Project(String name, String dueDate, double availablePoints, double earnedPoints, boolean hasGroups, boolean hasPresentation) {
        super(name, dueDate, availablePoints, earnedPoints);
        groups = hasGroups;
        presentations = hasPresentation;
    }
    
    /**
     * Returns whether or not the project has groups.
     * 
     * @return True if the project has groups, false otherwise.
     * @since 0.0.1
     */
    public boolean hasGroups() {
        return groups;
    }
    
    /**
     * Sets whether the project has groups or not.
     * 
     * @param hasGroups Whether the project has groups.
     * @since 0.0.1
     */
    public void setGroups(boolean hasGroups) {
        groups = hasGroups;
    }
    
    /**
     * Returns whether or not the project has presentations.
     * 
     * @return True if the project has presentations, false otherwise.
     * @since 0.0.1
     */
    public boolean hasPresentation() {
        return presentations;
    }
    
    /**
     * Sets whether the project has presentations or not.
     * 
     * @param hasPresentations Whether the project has presentations.
     * @since 0.0.1
     */
    public void setPresentation(boolean hasPresentations) {
        presentations = hasPresentations;
    }
}
