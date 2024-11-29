package com.spring;

public class Car {
    
    String brand;
    Engine engine; // Property name should match getter and setter names
    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter and setter for engine property
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car(String brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
    }
    
    public Car() {}
    
    public void Details() {
        System.out.println("=============Car Details==============");
        System.out.println("Brand :" + brand);
        System.out.println("=============Engine Details===========");
        System.out.println("cc = " + engine.getCc());
    }
}
