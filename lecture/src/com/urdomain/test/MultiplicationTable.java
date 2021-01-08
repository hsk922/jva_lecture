package com.urdomain.test;

public class MultiplicationTable {

	public static void main(String[] args) {
		MultiplicationTable multiplicationTable = new MultiplicationTable();
		
		int a = 2;
		int b = 4;
		multiplicationTable.multi(a,b);

	}

	public void multi(int a,int b) {
			System.out.println("*** " + a + "´Ü ***");
			for (int n=1; n<=9; n++) {
				System.out.println(a + " x " + n + " = " + (a*n));
			}
			System.out.println(); 
			
			System.out.println("*** " + b + "´Ü ***");
			for (int n=1; n<=9; n++) {
				System.out.println(b + " x " + n + " = " + (b*n));
			}
			
	}
}