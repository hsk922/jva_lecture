package com.urdomain.test;

public class loading {
	
	//필드
	int load;
	
	
	//생성자

	
	//메소드
	int loading() {
		return load;
	}
	
	void loadOn() {
		System.out.println("시스템 정보를 확인합니다.");
	}
	
	void nowloading() {
		for(int i=0; i<=100; i+=25) {
			load = i;
			System.out.println("로딩중...  " + load + "%");
		}
		
	}
	
	
}
