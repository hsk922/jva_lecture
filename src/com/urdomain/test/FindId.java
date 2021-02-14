package com.urdomain.test;

public class FindId {

	public static void main(String[] args) {	
	String[] user = {"myname","myid", "e@mail.com"} ;   // db 등록된 id,email
				
	String name = "myname"; // 사용자 입력값
	String email = "e@mail.com";
	
	if(name == user[0] && email == user[2]) {
		System.out.println(name + "님의 아이디는 " + user[1] + " 입니다."); // 아이디 일부 **처리
		
	} else {
		System.out.println("입력하신 이름과 이메일이 일치하지 않습니다.");
	}
	}
}
