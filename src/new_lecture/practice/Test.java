package new_lecture.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());	
		for (int i = 1; i <= T; i++) {
			String a = br.readLine();
			String b = br.readLine();
			int A = Integer.parseInt(a);
			int B = Integer.parseInt(b);
			bw.write(A + B + "\n");
		}
		bw.flush();
	}
}
