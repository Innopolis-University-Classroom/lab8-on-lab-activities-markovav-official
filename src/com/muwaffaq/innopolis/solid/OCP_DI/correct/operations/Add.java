package com.muwaffaq.innopolis.solid.OCP_DI.correct.operations;

public class Add implements CalculatorOperation {

    @Override
    public double apply(double left, double right) {
        return left + right;
    }
}
