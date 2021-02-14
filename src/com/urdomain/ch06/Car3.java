package com.urdomain.ch06;

public class Car3 {		//생성자의 오버로딩
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car3(){								// 1 생성자
		
	}
	
	Car3(String model){					// 2 생성자
		this.model = model;
	}
	
	Car3(String model, String color){	// 3 생성자
		this.model = model;
		this.color = color;
	}
	
	Car3(String model, String color, int maxSpeed){	// 3 생성자
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	
	
}
