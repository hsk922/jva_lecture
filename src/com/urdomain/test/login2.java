package com.urdomain.test;

import java.util.Scanner;

public class login2 {
	
	public static void main(String[] args) {	
		
		login2 test = new login2();

		String id = null;
		String pw = null;

				
		test.login(id,pw);

	}
		
//================================================================
	public void login(String id, String pw) {
		Scanner scanner = new Scanner(System.in);
		String[] user = {"id00", "1234"} ; //db ��ϵ� id, pw
		
		boolean	 login1 = true;
		while (login1) {
			System.out.println("���̵� �Է����ּ���.");
			id = scanner.nextLine();
			
			System.out.println("��й�ȣ�� �Է����ּ���.");
			pw = scanner.nextLine();
			
			if( id.equals(user[0]) && pw.equals(user[1]) )  {
				System.out.println("���������� �α��� �Ǿ����ϴ�.");
				System.out.println("------------------------");
				break;
			} else {
				System.out.println("���̵� Ȥ�� ��й�ȣ�� Ȯ���ϼ���.");
				System.out.println("------------------------");
			}
		}
		scanner.close();
	}

//================================================================	
	
}