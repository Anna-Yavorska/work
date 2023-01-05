package org.example.hw_11.task_1;

public class LegoValidationResult {
    private boolean validationPassed;
    private String message;

    public LegoValidationResult(boolean validationPassed, String message) {
        this.validationPassed = validationPassed;
        this.message = message;
    }
}
