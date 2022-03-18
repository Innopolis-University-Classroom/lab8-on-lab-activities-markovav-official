package com.muwaffaq.innopolis.solid.LSP_IS.correct;

import com.muwaffaq.innopolis.solid.LSP_IS.correct.actions.Eatable;
import com.muwaffaq.innopolis.solid.LSP_IS.correct.actions.Flyable;
import com.muwaffaq.innopolis.solid.LSP_IS.correct.actions.Hatchable;

// liskov principle the parent and the child can be reliable
public class Pigeon implements Animal, Flyable, Eatable, Hatchable {
    
    @Override
    public void fly() {
        System.out.println("Flying...");
    }

    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void hatch() {
        System.out.println("laying eggs");
    }
}
