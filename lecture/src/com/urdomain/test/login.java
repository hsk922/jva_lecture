package com.urdomain.test;

public class login {

	public static void main(String[] args) {	
		String[] user = {"id0001", "pw1234"} ; //db 등록된 id, pw

		String id = "abcd";//사용자가 입력한 id,pw
		String pw = "1234";

		if((id == user[0]) && (pw == user[1])) {
			System.out.println("정상적으로 로그인 되었습니다.");
		} else {
			System.out.println("아이디 혹은 비밀번호를 확인하세요.");
	}
	}	

}
