package com.thinkopen.patterns.structural.flyweight;

import java.awt.*;

public class Oval implements Shape {

	private boolean fill;

	public Oval(boolean fill) {
		this.fill = fill;
		System.out.println("Creating Oval object with fill=" + fill);
	}

	@Override
	public void draw(Graphics oval, int x, int y, int width, int height, Color color) {
		oval.setColor(color);
		oval.drawOval(x, y, width, height);

		if (fill)
			oval.fillOval(x, y, width, height);
	}
}
