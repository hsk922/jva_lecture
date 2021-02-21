package new_lecture.p2021_02_05;

import java.util.Arrays;
import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
//		1. 키보드를 이용해서 입력한 정수의 팩토리얼을 구하는 프로그램을 작성 하세요?
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int i = sc.nextInt();
		long fac = 1;
		int[] arr = new int[i];	//입력값 갯수만큼 배열 생성
		System.out.println(Arrays.toString(arr));
		
		for(int j=i; j>0; j--) {
			arr[j-1] = j;	//입력값 -1씩 배열에 대입
		}
		System.out.println(Arrays.toString(arr));
		
		for(int k=0; k<arr.length; k++) {
			fac=fac*arr[k];
		}
		System.out.println(i + "!: " + fac);
		sc.close();
	}

}
