package school.library;

import school.SchoolManagementApp;

public class LibrarySystemAdapter implements SchoolManagementApp {
    private final LibrarySystem librarySystem;

    public LibrarySystemAdapter(LibrarySystem librarySystem) {
        this.librarySystem = librarySystem;
    }

    @Override
    public void integrateSystem() {
        System.out.println("Integrating Library System...");
        librarySystem.manageBooks();
    }
}


