package org.example.hw_12.task_1;

// при такой подходе, чтобы разделить два новых числа необходимо будет создать еще один экземпляр класса, а это избыточно
// поэтому измени сигнатуру метода так, чтобы он принимал 2 аргумента, а поля класса убери
public class DivisionNumbersService {
    private int dividend;
    private int divisor;

    int divideNumbers() {
        int quotient = dividend / divisor;
        System.out.println("Частное = " + quotient);
        return quotient;
    }

    public void setDividend(int dividend) { // это лишний метод
        this.dividend = dividend;
    }

    public void setDivisor(int divisor) { // это лишний метод
        this.divisor = divisor;
    }
}
