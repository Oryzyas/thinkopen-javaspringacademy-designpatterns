package com.thinkopen.patterns.structural.decorator;

public class DecoratorTest {

	public static void main(String[] args) {
        System.out.println("Assemblando una Luxury Car...");
		Car luxuryCar = new LuxuryCar(new BasicCar());
		luxuryCar.assemble();
        System.out.println();

        System.out.println("Assemblando una Sport Car...");
		Car sportCar = new SportCar(new BasicCar());
		sportCar.assemble();
		System.out.println();

        System.out.println("Assemblando una Luxury Sport Car...");
		Car sportLuxuryCar = new SportCar(new LuxuryCar(new BasicCar()));
		sportLuxuryCar.assemble();
	}
}
