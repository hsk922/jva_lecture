package com.urdomain.ch06;

public class Car5_Example {

	public static void main(String[] args) {
		Car5 myCar5 = new Car5();
		
		
		myCar5.setGas(5);		//Car�� setGas() �޼ҵ� ȣ��
		
		boolean gasState = myCar5.isLeftGas();		//Car�� isLeftGas() �޼ҵ� ȣ��
		if(gasState) {
			System.out.println("����մϴ�.");
			myCar5.run();		//Car�� run() �޼ҵ� ȣ��
		}
		
		
		if(myCar5.isLeftGas()) {		//Car�� isLeftGas() �޼ҵ� ȣ��
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("gas�� �����ϼ���.");
		}
	}

}
