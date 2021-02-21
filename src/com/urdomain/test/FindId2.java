package com.urdomain.test;

import java.util.Scanner;

public class FindId2 {

	public static void main(String[] args) {
		
		FindId2 findid2 = new FindId2();
		
		String[] user = {"joy", "myid123", "e@mail.com"} ;   // db ����� �Է°�		
		Scanner scanner = new Scanner(System.in);
		
		String name = name1();
		String id = id1();
		String mail = mail1();
		
		System.out.println("�̸��� �Է����ּ���.");
		name = scanner.nextLine();	
		System.out.println("�̸����� �Է����ּ���.");
		mail = scanner.nextLine();
		
		if( name.equals(user[0]) && mail.equals(user[2]) )  {
			System.out.println(name + "���� ���̵�� " + findid2.Asterisk() + " �Դϴ�.");

		} else {
				System.out.println("�Է��Ͻ� ������ ��ϵǾ� ���� �ʽ��ϴ�.");
		}
		scanner.close();
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
		return idnew2; // ��ȯ�� ���� �Ǵ� ��  �����ҋ� �׻� ���ϰ� ���Ƿ� �ְ� ���� . �ϼ��� ���ϰ� �°� ����(��������)
		}
	//--------------------------------------------------------------------------	
}

