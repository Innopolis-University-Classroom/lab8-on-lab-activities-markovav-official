package com.muwaffaq.innopolis.solid.OCP_DI.correct;

import com.muwaffaq.innopolis.solid.OCP_DI.correct.operations.CalculatorOperation;

class Calculator {
    private double left;
    private double right;

    public Calculator(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public double calculate(CalculatorOperation operation) {
        return operation.apply(left, right);
    }

    public double getLeft() {
        return left;
    }

    public void setLeft(double left) {
        this.left = left;
    }

    public double getRight() {
        return right;
    }

    public void setRight(double right) {
        this.right = right;
    }
}


