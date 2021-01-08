package com.urdomain.ch06;

public class Car4 {		// 다른 생서앚를 호출해서 중복 코드 줄이기
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car4(){
		
	}
	
	Car4(String model){
		this(model, "은색", 250);
	}
	
	Car4(String model, String color){
		this(model, color, 250);
	}
	
	Car4(String model, String color, int maxSpeed){  // 여기 다 써놓고 위에 두개는 여기에서 불러옴.
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
