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
	
//--�α��� �Լ�ȭ--------------------------------------------
	public static int loginProcess(String id, String pw) {
		String[] user = {"id00", "1234"} ;
		
		
		int result = 0;		//�ʱ�ȭ
		
		if( id.equals(user[0]) && pw.equals(user[1]) ) {
			result = 1;		// ������ �ʱ�ȭ ��Ű�� ������ ����.
		} else {
			result = 0;
		}
		return result; //��ȯ�� ���� �Ǵ� ��
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
