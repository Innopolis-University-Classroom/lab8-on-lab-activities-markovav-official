package com.muwaffaq.innopolis.solid.OCP_DI.correct.operations;

public class Divide implements CalculatorOperation {

    @Override
    public double apply(double left, double right) {
        if (right == 0) throw new IllegalArgumentException("Argument 'right' is 0");
        return left / right;
    }
}
