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
		System.out.println("        ��ȣ�� ��ġ���� �ʽ��ϴ�.        ");
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
		System.out.println("    ��ȣ�� 3ȸ ���� ��ġ���� �ʽ��ϴ�.   ");
		System.out.println("---------�ý����� �����մϴ�.---------");
		powerOff();
		
		
	} else {
		System.out.println();
		System.out.println("==================================");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("                                  ");
		System.out.println("             ȯ���մϴ�.             ");
		System.out.println("          Administrator��.        ");
		System.out.println("==================================");
		System.out.println();
		System.out.println();
		try {
			Thread.sleep(1500); //1.5�� ���
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		runs();
		break;
	}
	
}
