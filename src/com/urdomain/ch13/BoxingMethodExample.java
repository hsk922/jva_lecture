package com.urdomain.ch13;

public class BoxingMethodExample {

	public static void main(String[] args) {
		Box3<Integer> box3 = Util.<Integer>boxing(100);
		int intValue = box3.get();
		System.out.println(intValue);
		
		Box3<String> box4 = Util.boxing("홍길동");
		String strValue = box4.get();
		System.out.println(strValue);
	}

}
