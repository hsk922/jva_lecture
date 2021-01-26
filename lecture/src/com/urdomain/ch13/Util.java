package com.urdomain.ch13;

public class Util {
	public static <T> Box3<T> boxing(T t) {
		Box3<T> box3 = new Box3<>();
		box3.set(t);
		return box3;
	}
}
