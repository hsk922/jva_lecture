package com.urdomain.ch10;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		String data = null;
//		String data2 = null;
//		String data3 = "";
		
		if(data == null) {
			data = "anything";
		}
		System.out.println(data.toString());

	}

}
