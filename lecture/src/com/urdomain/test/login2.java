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
		String[] user = {"id00", "1234"} ; //db 등록된 id, pw
		
		boolean	 login1 = true;
		while (login1) {
			System.out.println("아이디를 입력해주세요.");
			id = scanner.nextLine();
			
			System.out.println("비밀번호를 입력해주세요.");
			pw = scanner.nextLine();
			
			if( id.equals(user[0]) && pw.equals(user[1]) )  {
				System.out.println("정상적으로 로그인 되었습니다.");
				System.out.println("------------------------");
				break;
			} else {
				System.out.println("아이디 혹은 비밀번호를 확인하세요.");
				System.out.println("------------------------");
			}
		}
	}

//================================================================	
	
}