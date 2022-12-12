package org.example.hw_8.task_1;

//+
public class SecretLocker {
    private final String passcode;

    public SecretLocker(String passcode) {
        this.passcode = passcode;
    }

    @Override
    public String toString() {
        return "SecretLocker{" +
                "passcode='" + passcode + '\'' +
                '}';
    }
}
