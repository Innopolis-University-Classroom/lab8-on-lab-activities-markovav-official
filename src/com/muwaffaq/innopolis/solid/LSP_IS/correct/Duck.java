package com.muwaffaq.innopolis.solid.LSP_IS.correct;

import com.muwaffaq.innopolis.solid.LSP_IS.correct.actions.Eatable;
import com.muwaffaq.innopolis.solid.LSP_IS.correct.actions.Flyable;
import com.muwaffaq.innopolis.solid.LSP_IS.correct.actions.Hatchable;
import com.muwaffaq.innopolis.solid.LSP_IS.correct.actions.Swimable;

public class Duck implements Animal, Flyable, Eatable, Hatchable, Swimable {

    @Override
    public void fly() {
        System.out.println("Flying...");
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public void hatch() {
        System.out.println("Laying eggs...");
    }

    @Override
    public void swim() {
        System.out.println("Swimming...");
    }
}
