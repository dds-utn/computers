package domain;

public class ComputerDoesNotHaveRequiredComponents extends RuntimeException {

    public ComputerDoesNotHaveRequiredComponents() {
        super();
    }

    public ComputerDoesNotHaveRequiredComponents(String message) {
        super(message);
    }

    public ComputerDoesNotHaveRequiredComponents(String message, Throwable cause) {
        super(message, cause);
    }
}