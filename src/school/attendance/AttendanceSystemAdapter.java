package school.attendance;

import school.SchoolManagementApp;

/**
 * Adapter: Bridges the AttendanceSystem to the unified SchoolManagementApp interface.
 */
public class AttendanceSystemAdapter implements SchoolManagementApp {
    private final AttendanceSystem attendanceSystem;

    public AttendanceSystemAdapter(AttendanceSystem attendanceSystem) {
        this.attendanceSystem = attendanceSystem;
    }

    @Override
    public void integrateSystem() {
        System.out.println("Integrating Attendance System...");
        attendanceSystem.markAttendance();
    }
}


