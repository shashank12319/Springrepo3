package com.jpa.text;

public class Car {
    private Engine engine;

    public Car(Engine engine ) {
        this.engine = engine;
        
    }

    public void start() {
        engine.start();
        //System.out.println("Car started.");
    }
}
