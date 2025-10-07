package school.attendance;

import school.SchoolManagementApp;

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


