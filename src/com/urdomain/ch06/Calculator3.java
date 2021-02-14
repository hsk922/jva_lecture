package com.urdomain.ch06;

public class Calculator3 {		//메소드 오버로딩
	//정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	
	//직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
	
}
