package com.urdomain.test;

public class loginnew {

	public static void main(String[] args) {
		
		loginnew login = new loginnew();
		String id = "id00";
		String pw = "1234";
		int Login = 0;
		Login = loginProcess(id,pw);
		System.out.println(Login);
		
		login.syso(Login);
	}
	
//--로그인 함수화--------------------------------------------
	public static int loginProcess(String id, String pw) {
		String[] user = {"id00", "1234"} ;
		
		
		int result = 0;		//초기화
		
		if( id.equals(user[0]) && pw.equals(user[1]) ) {
			result = 1;		// 위에서 초기화 시키지 않으면 오류.
		} else {
			result = 0;
		}
		return result; //반환형 변수 또는 값
	}
//-------------------------------------------------------
	public void syso(int result) {
		if(result == 1 ) {
			System.out.println("success.");
		} else {
			System.out.println("fail.");
		}
	}
//-------------------------------------------------------
	
	
}
