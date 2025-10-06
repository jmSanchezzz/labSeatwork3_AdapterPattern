package school;

import java.util.ArrayList;
import java.util.List;

import school.attendance.AttendanceSystem;
import school.attendance.AttendanceSystemAdapter;
import school.grading.GradingSystem;
import school.grading.GradingSystemAdapter;
import school.library.LibrarySystem;
import school.library.LibrarySystemAdapter;

/**
 * Client / Demo: Shows how the unified interface can integrate multiple
 * independent systems via their respective adapters.
 */
public class Main {
    public static void main(String[] args) {
        List<SchoolManagementApp> integrations = new ArrayList<>();

        integrations.add(new AttendanceSystemAdapter(new AttendanceSystem()));
        integrations.add(new GradingSystemAdapter(new GradingSystem()));
        integrations.add(new LibrarySystemAdapter(new LibrarySystem()));

        for (SchoolManagementApp app : integrations) {
            app.integrateSystem();
            System.out.println();
        }
    }
}


