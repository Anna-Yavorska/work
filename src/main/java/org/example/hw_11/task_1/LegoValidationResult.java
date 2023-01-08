package org.example.hw_11.task_1;

public class LegoValidationResult {
    private boolean validationPassed;
    private String message;

    public LegoValidationResult(boolean validationPassed, String message) {
        this.validationPassed = validationPassed;
        this.message = message;
    }

    public boolean isValidationPassed() {
        return validationPassed;
    }

    public void setValidationPassed(boolean validationPassed) {
        this.validationPassed = validationPassed;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
