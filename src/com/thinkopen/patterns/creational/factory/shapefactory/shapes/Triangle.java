package com.thinkopen.patterns.creational.factory.shapefactory.shapes;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Ciao sono un Triangolo!");
    }
}
