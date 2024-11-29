package com.spring;

public class Engine {
    private int cc;

    // Default constructor
    public Engine() {
    }

    // Constructor with parameters
    public Engine(int cc) {
        this.cc = cc;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
}
