package com.urdomain.test;

public class FindId {

	public static void main(String[] args) {	
	String[] user = {"myname","myid", "e@mail.com"} ;   // db ��ϵ� id,email
				
	String name = "myname"; // ����� �Է°�
	String email = "e@mail.com";
	
	if(name == user[0] && email == user[2]) {
		System.out.println(name + "���� ���̵�� " + user[1] + " �Դϴ�."); // ���̵� �Ϻ� **ó��
		
	} else {
		System.out.println("�Է��Ͻ� �̸��� �̸����� ��ġ���� �ʽ��ϴ�.");
	}
	}
}
