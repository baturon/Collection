package com.company;

import java.util.Map;

public class DecoratorDemo {
    public static void main(String[] args) {

    }
}

interface Man {
    void walk();

}

class Pedestrian implements Man {

    @Override
    public void walk() {
        System.out.println("Pedestrian goes down the street");

    }
}

abstract class Decorator implements Man {
    protected Man man;


    public Decorator(Man man) {
        this.man = man;
    }

    @Override
    public void walk() {
        man.walk();

    }
}

class Shoemaker extends Decorator {

    public Shoemaker(Man man) {
        super(man);
    }

    @Override
    public void walk() {
        System.out.println("I made shoe for the man");

        super.walk();
    }
}