package com.thinkopen.patterns.creational.factory;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        int lati = Integer.parseInt(args[0]);

        ShapeFactory.getShape(lati).draw();
    }

}
