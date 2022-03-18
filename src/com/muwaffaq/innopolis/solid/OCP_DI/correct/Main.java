package com.muwaffaq.innopolis.solid.OCP_DI.correct;

import com.muwaffaq.innopolis.solid.OCP_DI.correct.operations.Add;
import com.muwaffaq.innopolis.solid.OCP_DI.correct.operations.Multiply;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(1, 3);
        calculator.setLeft(calculator.calculate(new Add()));
        System.out.println(calculator.calculate(new Multiply()));
    }
}
