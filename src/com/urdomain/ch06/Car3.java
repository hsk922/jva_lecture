package com.urdomain.ch06;

public class Car3 {		//�������� �����ε�
	//�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������
	Car3(){								// 1 ������
		
	}
	
	Car3(String model){					// 2 ������
		this.model = model;
	}
	
	Car3(String model, String color){	// 3 ������
		this.model = model;
		this.color = color;
	}
	
	Car3(String model, String color, int maxSpeed){	// 3 ������
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	
	
}
