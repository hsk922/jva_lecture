package new_lecture.p2021_02_04;

import java.util.Scanner;

public class Oper05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner클래스는 예외처리 하지 않는다.
		System.out.println("정수 2개를 입력 하세요?");
	
		Scanner sc = new Scanner(System.in); //in 정적 필드
		
//		InputStream is =  System.in;		//2줄로 표현
//		Scanner s = new Scanner(is);
		
		
		
		int n1 = sc.nextInt();  // 2개 이상 값 입력시 스페이스바 or 엔터키로 구분함
		int n2 = sc.nextInt();	// String 값은 nextStr이 아니라 nextLine으로 입력.
		System.out.println("n1:"+n1);
		System.out.println("n2:"+n2);
		
		if(n1 > n2) {
			System.out.println(n1+"이 "+n2+"보다 크다.");
		}else {
			System.out.println(n2+"이 "+n1+"보다 크다.");
		}
	
	}
 
}
