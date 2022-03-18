package com.muwaffaq.innopolis.solid.LSP_IS.correct;


import com.muwaffaq.innopolis.solid.LSP_IS.correct.actions.Eatable;
import com.muwaffaq.innopolis.solid.LSP_IS.correct.actions.Hatchable;
import com.muwaffaq.innopolis.solid.LSP_IS.correct.actions.Swimable;

public class Penguin implements Animal, Eatable, Hatchable, Swimable {
    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void hatch() {
        System.out.println("laying eggs");
    }

    @Override
    public void swim() {
        System.out.println("swim");
    }
}
