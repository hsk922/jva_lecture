package com.urdomain.test;

import java.util.Scanner;

public class FindId2 {

	public static void main(String[] args) {
		
		FindId2 findid2 = new FindId2();
		
		String[] user = {"joy", "myid123", "e@mail.com"} ;   // db 사용자 입력값		
		Scanner scanner = new Scanner(System.in);
		
		String name = name1();
		String id = id1();
		String mail = mail1();
		
		System.out.println("이름을 입력해주세요.");
		name = scanner.nextLine();	
		System.out.println("이메일을 입력해주세요.");
		mail = scanner.nextLine();
		
		if( name.equals(user[0]) && mail.equals(user[2]) )  {
			System.out.println(name + "님의 아이디는 " + findid2.Asterisk() + " 입니다.");

		} else {
				System.out.println("입력하신 정보는 등록되어 있지 않습니다.");
		}
	}

	//--------------------------------------------------------------------------
	public static String name1() {
		return "joy";
	}
	public static String id1() {
		return "myid123";
	}
	public static String mail1() {
		return "e@mail.com";
	}
	//--------------------------------------------------------------------------
	public String Asterisk() {	
		char[] idnew = new char[id1().length()];

				for(int i=0;i<idnew.length;i++){ 
				idnew[i]=(id1().charAt(i));
				}
				if(idnew.length>=1 && idnew.length<=3) {
				
				} else if(idnew.length>=4 && idnew.length<7){
					idnew[3]= '*';
					idnew[4]= '*';
				} else {
					idnew[3]= '*';
					idnew[4]= '*';
					idnew[5]= '*';
				}	
					String idnew2 = String.valueOf(idnew); 
		return idnew2; // 반환형 변수 또는 값  시작할떄 항상 리턴값 임의로 주고 시작 . 완성후 리턴값 맞게 변경(오류제거)
		}
	//--------------------------------------------------------------------------	
}

