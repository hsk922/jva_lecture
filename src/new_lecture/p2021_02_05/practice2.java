package new_lecture.p2021_02_05;

import java.util.Arrays;

public class practice2 {

	public static void main(String[] args) {
//		2. 1~45사이의 숫자를 6개 추출 하는 프로그램을 작성 하세요? 
//			    (단, 중복된 숫자는 1번만 출력 되도록 한다.)
//			    Math.random() 이용해서 프로그램을 작성 하세요.
//			          0.0 <= Math.random() < 1.0
		
		System.out.println("1~45 사이의 무작위 숫자 6개를 추출해드립니다.");
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			for(int j=0; j<i; j++) {
				if(lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
		
		for(int i=0; i<lotto.length; i++) {    
			System.out.print(" " + lotto[i] + " ");
		}

	}

}
