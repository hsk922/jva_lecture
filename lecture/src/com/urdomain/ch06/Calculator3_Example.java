package com.urdomain.ch06;

public class Calculator3_Example {		//�޼ҵ� �����ε�

	public static void main(String[] args) {
		Calculator3 myCalcu3 = new Calculator3();
		
		
		//���簢���� ���� ���ϱ�
		double result1 = myCalcu3.areaRectangle(10);
		
		
		//���簢���� ���� ���ϱ�
		
		double result2 = myCalcu3.areaRectangle(10, 20);
		
		
		//��� ���
		System.out.println("���簢�� ����=" + result1);
		System.out.println("���簢�� ����=" + result2);
	
	}

}
