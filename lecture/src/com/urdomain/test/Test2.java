package com.urdomain.test;

public class Test2 {
	if(!pw.equals(winPw()) ) {
		for(int j=0; j<4; j++) {
		System.out.println();
		System.out.println();
		System.out.println("==================================");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("        암호가 일치하지 않습니다.        ");
		System.out.println("==================================");
		System.out.println();
		System.out.println();
		j++;
		}
	if(j==3) {
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		System.out.println("    암호가 3회 연속 일치하지 않습니다.   ");
		System.out.println("---------시스템을 종료합니다.---------");
		powerOff();
		
		
	} else {
		System.out.println();
		System.out.println("==================================");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("             환영합니다.             ");
		System.out.println("          Administrator님.        ");
		System.out.println("==================================");
		System.out.println();
		System.out.println();
		try {
			Thread.sleep(1500); //1.5초 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		runs();
		break;
	}
	
}
