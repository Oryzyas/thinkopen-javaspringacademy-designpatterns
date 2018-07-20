package com.thinkopen.patterns.creational.factory.shapefactory.shapes;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Ciao sono un Cerchio!");
    }
}
