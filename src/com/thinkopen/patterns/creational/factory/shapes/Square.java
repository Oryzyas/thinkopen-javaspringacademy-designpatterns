package com.thinkopen.patterns.creational.factory.shapes;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Ciao sono un Quadrato!");
    }
}
