package com.jpa.text;


public class Engine {
	public static int count=0;
    private String type;

    public Engine() {
    }

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println("Engine Started  " +  count);
        count++;
        
    }

}
