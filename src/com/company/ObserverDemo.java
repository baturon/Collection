package com.company;

import java.util.Observable;
import java.util.Observer;

public class ObserverDemo {
    public static void main(String[] args) {

    }
}

class Child extends Observable {
    public void make(){

        setChanged();

    }

}

class Mother implements Observer {

    @Override
    public void update(Observable o, Object arg) {

    }
}
