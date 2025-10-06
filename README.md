# labSeatwork3_AdapterPattern

Java Adapter Pattern – Unified School Management Application

This project demonstrates the Adapter Design Pattern in Java by integrating three independent school systems (Attendance, Grading, Library) into a unified interface `SchoolManagementApp` used by a client `Main` program.

Project layout

```
src/
  school/
    SchoolManagementApp.java
    Main.java
    attendance/
      AttendanceSystem.java
      AttendanceSystemAdapter.java
    grading/
      GradingSystem.java
      GradingSystemAdapter.java
    library/
      LibrarySystem.java
      LibrarySystemAdapter.java
```

How to compile and run (Windows PowerShell)

```powershell
# From the project root
javac -d out $(Get-ChildItem -Recurse -Filter *.java | ForEach-Object { $_.FullName })
java -cp out school.Main
```

Expected output (example)

```
Integrating Attendance System...
Attendance marked for today.
Integrating Grading System...
Grades recorded successfully.
Integrating Library System...
Library books managed.
```
