package com.urdomain.test;

public class login {

	public static void main(String[] args) {	
		String[] user = {"id0001", "pw1234"} ; //db ��ϵ� id, pw

		String id = "abcd";//����ڰ� �Է��� id,pw
		String pw = "1234";

		if((id == user[0]) && (pw == user[1])) {
			System.out.println("���������� �α��� �Ǿ����ϴ�.");
		} else {
			System.out.println("���̵� Ȥ�� ��й�ȣ�� Ȯ���ϼ���.");
	}
	}	

}
