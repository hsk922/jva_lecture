package new_lecture.p2021_02_04;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		int n1, n2, n3, max, min, a1, a2, b1, b2;
		System.out.println("정수 3개를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
//		1안)
//		a1 = (n1 > n2) ? n1 : n2;	
//		a2 = (n2 > n3) ? n2 : n3;
//		max = (a1 > a2) ? a1 : a2;
//		
//		b1 = (n1 < n2) ? n1 : n2;
//		b2 = (n2 < n3) ? n2 : n3;
//		min = (b1 < b2) ? b1 : b2;	
		
//		2안)
		max = (n1 > n2) ? n1 : n2;
		max = (max > n3) ? max : n3;
		
		min = (n1 < n2) ? n1 : n2;
		min = (min < n3) ? min : n3;
		
//		a1 = (n1 > n2 && n3 > n2) ? n2 : 1;
	
		
		
		
		System.out.println("max:"+max);
		System.out.println("min:"+min);
		
		
		
	}

}
