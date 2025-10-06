package school.grading;

import school.SchoolManagementApp;

/**
 * Adapter: Bridges the GradingSystem to the unified SchoolManagementApp interface.
 */
public class GradingSystemAdapter implements SchoolManagementApp {
    private final GradingSystem gradingSystem;

    public GradingSystemAdapter(GradingSystem gradingSystem) {
        this.gradingSystem = gradingSystem;
    }

    @Override
    public void integrateSystem() {
        System.out.println("Integrating Grading System...");
        gradingSystem.recordGrades();
    }
}


