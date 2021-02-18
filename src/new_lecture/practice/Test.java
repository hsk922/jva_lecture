package new_lecture.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String T = br.readLine();
		int t = Integer.parseInt(T);	
		
		for (int i = 1; i <= t; i++) {
			String a = br.readLine();
			String b = br.readLine();
			int A = Integer.parseInt(a);
			int B = Integer.parseInt(b);
			System.out.println(A + B);
		}

	}
}
