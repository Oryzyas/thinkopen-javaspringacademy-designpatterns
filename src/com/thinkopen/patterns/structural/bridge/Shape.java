package com.thinkopen.patterns.structural.bridge;

public abstract class Shape {

	//composition - implementor
	protected Color color;

	//constructor with implementor as input argument
	public Shape(Color color) {
		this.color = color;
	}

	abstract public void applyColor();
}
