package com.urdomain.ch06;

public class Car8 {

	int speed;
	
	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	
	public static void main(String[] args) {
		Car8 myCar8 = new Car8();
		myCar8.speed = 60;
		myCar8.run();

	}

}
