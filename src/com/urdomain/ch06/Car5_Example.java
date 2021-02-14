package com.urdomain.ch06;

public class Car5_Example {

	public static void main(String[] args) {
		Car5 myCar5 = new Car5();
		
		
		myCar5.setGas(5);		//Car의 setGas() 메소드 호출
		
		boolean gasState = myCar5.isLeftGas();		//Car의 isLeftGas() 메소드 호출
		if(gasState) {
			System.out.println("출발합니다.");
			myCar5.run();		//Car의 run() 메소드 호출
		}
		
		
		if(myCar5.isLeftGas()) {		//Car의 isLeftGas() 메소드 호출
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}

}
