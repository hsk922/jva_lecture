package com.urdomain.ch11;

public class NewInstanceExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("com.urdomain.ch11.ReceiveAction");
			Action action = (Action) clazz.newInstance();
			action.execute();
		} catch (Exception e) {
			
			e.printStackTrace();

		}

	}

}
