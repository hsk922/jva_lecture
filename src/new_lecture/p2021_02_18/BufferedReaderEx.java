package new_lecture.p2021_02_18;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderEx {

	public static void main(String[] args) {		
// 키보드로 구구단 1개 단을 입력받아서 
//구구단 1개 단을 출력하는 프로그램을 작성하시오
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("원하는 단을 입력하세요~!");
		try {
			String a = br.readLine();
			int dan = Integer.parseInt(a);
			for(int i=1; i<10; i++) {
				System.out.println( dan + " x " + i + " = " + (dan*i) );
			}
		} catch (Exception e) {
			System.out.println("숫자만 입력하세요!");
			
		}
		
		
		

	}

}
