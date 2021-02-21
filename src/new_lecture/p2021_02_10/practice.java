package new_lecture.p2021_02_10;

import java.util.Scanner;

public class practice {
	
	public static void checkman(String ssn){
		
		int check = Integer.parseInt(ssn.substring(12));
//		System.out.println("cNum:"+cNum);
		int[] cNum = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
		int a = 0;
		int ch1 = a%11;
		int ch2 = 11-ch1;
		
		for(int i=0; i<12; i++) {
			a += Integer.parseInt(ssn.substring(i,i+1))*cNum[i];
		}
//		System.out.println(a);
//		System.out.println("a/11몫:"+a/11);
//		System.out.println("a/11나머지:"+a%11);
		if(ch2 >=10) {
			ch2=ch2%10;
//			System.out.println(ch2);
		}
		if(ch2==check) {
			System.out.println("올바른 주민등록번호 입니다.");
		} else {
			System.out.println("잘못된 주민등록번호 입니다.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호 앞자리를 입력하세요.");
		String n1 = sc.nextLine();
		System.out.println("주민등록번호 뒷자리를 입력하세요.");
		String n2 = sc.nextLine();
		String ssn = n1+n2;
		String g = n2.substring(0, 1);	//주민번호 뒷자리 성별검사
		//숫자형태로 받으면 뿌릴때 힘듬
		if(n1.equals("")) {
			System.out.println("주민번호 앞자리를 입력 하세요.");
		}else if(n1.length() != 6) {
			System.out.println("주민번호 앞자리 6자리를 입력 하세요.");
		}else if(n2.equals("")) {
			System.out.println("주민번호 뒷자리를 입력 하세요.");
		}else if(n2.length() != 7) {
			System.out.println("주민번호 뒷자리 7자리를 입력 하세요.");
			//메소드를 하나 만들어서 주민번호를 전달하여 검사하는 것을 만들어라.
		}else {
			if(g.equals("1") || g.equals("3")) {
				System.out.println("남자 입니다.");
				checkman(ssn);
			}else if(g.equals("2") || g.equals("4")) {
				System.out.println("여자 입니다.");
				checkman(ssn);
			}else {
				System.out.println("똑바로 입력하세요~!!");
			}
		}
		sc.close();
	}

}
