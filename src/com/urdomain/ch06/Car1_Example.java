package com.urdomain.ch06;

public class Car1_Example {

	public static void main(String[] args) {
		//��ü ����
		Car1 myCar1 = new Car1();
		
		//�ʵ尪 �б�
		System.out.println("����ȸ��:" + myCar1.company);
		System.out.println("�𵨸�:" + myCar1.model);
		System.out.println("����:" + myCar1.color);
		System.out.println("�ְ�ӵ�:" + myCar1.maxSpeed);
		System.out.println("����ӵ�:"+ myCar1.speed);
		
		//�ʵ尪 ����
		myCar1.speed = 60;
		System.out.println("������ �ӵ�: " + myCar1.speed);

	}

}
