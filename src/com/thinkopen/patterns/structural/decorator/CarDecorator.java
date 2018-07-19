package com.thinkopen.patterns.structural.decorator;

public abstract class CarDecorator implements Car {

	protected Car car;

	public CarDecorator(Car car) {
		this.car = car;
	}

	@Override
	public void assemble() {
		this.car.assemble();
	}

}
