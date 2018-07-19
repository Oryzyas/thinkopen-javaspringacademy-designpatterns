package com.thinkopen.patterns.structural.flyweight;

import java.awt.*;

public class Line implements Shape {

	public Line() {
		System.out.println("Creating Line object");
	}

	@Override
	public void draw(Graphics line, int x, int y, int width, int height, Color color) {
		line.setColor(color);
		line.drawLine(x, y, width, height);
	}
}
