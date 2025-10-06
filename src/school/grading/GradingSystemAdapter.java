package school.grading;

import school.SchoolManagementApp;

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


