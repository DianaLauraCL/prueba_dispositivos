package com.example.dispositivosmoviles.Calculator;

public class BasicCalculator implements Calculator {

    @Override
    public double sumar(double a, double b) {
        return a + b;
    }

    @Override
    public double restar(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a * b;
    }

    @Override
    public double dividir(double a, double b) {

        if (b == 0) {
            return Double.NaN;
        }
        return a / b;
    }
}
