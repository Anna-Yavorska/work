package org.example.hw_7.task_1;

public class LegoValidationResult {
    private boolean validationPassed = true;
    private String message;


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
