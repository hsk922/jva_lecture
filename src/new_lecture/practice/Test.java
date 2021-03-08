package new_lecture.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().split(" ");
		for (int i = 1; i <= T; i++) {
			int a = Integer.parseInt(strs[0]);
			int b = Integer.parseInt(strs[1]);
			int c = a+b;
			System.out.println("Case #"+i+": "+a+" + "+b+" = "+c);
			
		}
		
	}
}
