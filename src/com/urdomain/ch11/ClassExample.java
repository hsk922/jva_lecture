package com.urdomain.ch11;

public class ClassExample {

	public static void main(String[] args) {
		Bar bar = new Bar();
		Class clazz1 = bar.getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();

		try {
			Class clazz2 = Class.forName("com.urdomain.ch11.Bar");
			System.out.println(clazz1.getName());
			System.out.println(clazz1.getSimpleName());
			System.out.println(clazz1.getPackage().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
