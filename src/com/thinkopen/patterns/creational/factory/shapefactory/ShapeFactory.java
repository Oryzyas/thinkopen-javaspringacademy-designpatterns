package com.thinkopen.patterns.creational.factory.shapefactory;

import com.thinkopen.patterns.creational.factory.shapefactory.shapes.Circle;
import com.thinkopen.patterns.creational.factory.shapefactory.shapes.Shape;
import com.thinkopen.patterns.creational.factory.shapefactory.shapes.Square;
import com.thinkopen.patterns.creational.factory.shapefactory.shapes.Triangle;

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
