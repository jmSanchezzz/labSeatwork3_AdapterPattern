package school;

/**
 * Target interface for the Adapter pattern.
 * Provides a unified contract used by the client (Main) to integrate
 * multiple independent school systems behind a common operation.
 */
public interface SchoolManagementApp {
    /**
     * Integrates a specific school system. Implementations delegate to the
     * underlying adaptee system's native method.
     */
    void integrateSystem();
}


