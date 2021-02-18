package new_lecture.p2021_02_18;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 키보드로 입력한 문장을 파일(result.txt)로 저장하는 프로그램을 작성하세요?
// 키보드 입력 : BufferedReader
// 파일 출력 : FileWriter

		System.out.println("문장을 입력하세요?");
// 기존내용을 덮어 쓰는 식으로 처리됨. 
		BufferedReader br = 
	new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String input = br.readLine();

			//출력객체 생성 + 저장파일명
			FileWriter fw = new FileWriter("result.txt");
			fw.write(input);//input값 저장

			fw.close();//반드시 닫아줘야함
			System.out.println("저장 성공~!!");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
