package com.urdomain.ch06;

public class Car1_Example {

	public static void main(String[] args) {
		//객체 생성
		Car1 myCar1 = new Car1();
		
		//필드값 읽기
		System.out.println("제작회사:" + myCar1.company);
		System.out.println("모델명:" + myCar1.model);
		System.out.println("색깔:" + myCar1.color);
		System.out.println("최고속도:" + myCar1.maxSpeed);
		System.out.println("현재속도:"+ myCar1.speed);
		
		//필드값 변경
		myCar1.speed = 60;
		System.out.println("수정된 속도: " + myCar1.speed);

	}

}
