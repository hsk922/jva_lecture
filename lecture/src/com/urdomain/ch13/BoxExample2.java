package com.urdomain.ch13;

public class BoxExample2 {

	public static void main(String[] args) {
		Box2<String> box2 = new Box2<String>();
		box2.set("홍길동");
		String name2 = box2.get();
		
		Box2<Integer> box3 = new Box2<Integer>();
		box3.set(6);
		int value = box3.get();
	
	}

}
