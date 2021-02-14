package com.urdomain.ch06;

public class Television {		//정적 초기화 블록
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	static {
		info =  company + "-" + model;
	}
}
