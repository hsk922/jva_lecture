package new_lecture.p2021_02_05;

import java.util.Scanner;

public class While04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=2;		//	초기값
		while (n<10) {			//	조건식: 단
			System.out.println(n + "단: ");
			int i = 1;
			while(i<10) {		
				System.out.println(n + " * " + i + " = " + n*i);
				i++;
			} // i = 10
			System.out.println();
			n++;
		}
	}

}
