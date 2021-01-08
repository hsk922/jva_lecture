package com.urdomain.ch06;

public class Car6_Example {

	public static void main(String[] args) {
		Car6 myCar6 = new Car6();
		myCar6.keyTurnOn();
		myCar6.run();
		int speed = myCar6.getSpeed();
		System.out.println("현재 속도:" + speed + "km/h");
	}

}
