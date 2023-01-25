package com.jpa.text;


public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Car is driving with "+ engine.getType()+ " engine");
        //Integer.toHexString(System.identityHashCode
        	System.out.println(Integer.toHexString(System.identityHashCode
                	(this.engine)));
    }

}
