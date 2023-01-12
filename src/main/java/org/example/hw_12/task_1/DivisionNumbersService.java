package org.example.hw_12.task_1;

public class DivisionNumbersService {
    private int dividend;
    private int divisor;

    int divideNumbers() {
        int quotient = dividend / divisor;
        System.out.println("Частное = " + quotient);
        return quotient;
    }

    public void setDividend(int dividend) {
        this.dividend = dividend;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }
}
