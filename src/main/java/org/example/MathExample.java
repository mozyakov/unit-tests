package org.example;

public class MathExample {

    private final double a;
    private final double b;

    public MathExample(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double sum() {
        return this.a + this.b;
    }

    public double diffAB() {
        return this.a - this.b;
    }

    public double diffBA() {
        return this.b - this.a;
    }

    public double multiplication() {
        return this.a * this.b;
    }

    public double division() {
        if(this.b == 0) {
            throw new ArithmeticException("Деление на 0");
        }
        return this.a / this.b;
    }
}
