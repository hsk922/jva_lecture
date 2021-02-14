package com.urdomain.ch06;

public class Calculator3_Example {		//메소드 오버로딩

	public static void main(String[] args) {
		Calculator3 myCalcu3 = new Calculator3();
		
		
		//정사각형의 넓이 구하기
		double result1 = myCalcu3.areaRectangle(10);
		
		
		//직사각형의 넓이 구하기
		
		double result2 = myCalcu3.areaRectangle(10, 20);
		
		
		//결과 출력
		System.out.println("정사각형 넓이=" + result1);
		System.out.println("직사각형 넓이=" + result2);
	
	}

}
