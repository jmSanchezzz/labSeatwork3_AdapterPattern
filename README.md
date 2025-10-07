# labSeatwork3_AdapterPattern

Java Adapter Pattern – Unified School Management Application

This project demonstrates the Adapter Design Pattern in Java by integrating three independent school systems (Attendance, Grading, Library) into a unified interface `SchoolManagementApp` used by a client `Main` program.

Project layout (Maven / IntelliJ)

```
src/
  main/
    java/
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
pom.xml
```

How to import/run in IntelliJ

- File → New → Project from Existing Sources... → select `pom.xml` → Finish
- Run configuration: IntelliJ will detect `school.Main` as an application. Click Run.

How to compile and run with Maven (CLI)

```powershell
mvn -q -e -DskipTests=true clean package
mvn -q -DskipTests=true exec:java -Dexec.mainClass=school.Main
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
