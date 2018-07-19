package com.thinkopen.patterns.creational.factory;

import com.thinkopen.patterns.creational.factory.shapes.Circle;
import com.thinkopen.patterns.creational.factory.shapes.Shape;
import com.thinkopen.patterns.creational.factory.shapes.Square;
import com.thinkopen.patterns.creational.factory.shapes.Triangle;

public class ShapeFactory {

    public static Shape getShape(int lati) {
        if(lati < 3)
            return new Circle();
        else if(lati == 3)
            return new Triangle();
        else if(lati == 4)
            return new Square();

        return null;
    }

}
