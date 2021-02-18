package new_lecture.p2021_02_18;

import java.io.FileInputStream;

public class FileInputStreamTest {
	public static void main(String[] args) {

		// 입력을 받아들이는 변수 선언
		int inputValue = 0;

		// FileInputStream 객체 선언
		FileInputStream file = null;

			// "read.txt"와 InputStream 형성
		try {
			file = new FileInputStream("read.txt");
		    // 내용이 1바이트짜리만 호출가능?
		    // 절대경로 ("c:\read.txt"); 이런식
//		    FileInputStream file = new FileInputStream( "read.txt" );
			//이렇게 try안에서 다 돌아간다고 집어넣으면 지역변수처럼 되버림.
		    //그래서 밑에 finally에서 사용하지 못하는 상황이 발생함.
			
			// file의 끝을 만날 때까지 한개씩 데이터를 읽어 들임
			// read() 메소드는 File에서 한 byte씩 데이터를 읽어옴.
			// 읽어온 데이터를 int로 변환해서 리턴,파일의 끝을
			// 만나면 read() 자체에서 -1을 반환함.
			// -1이 되면 false가 되어 루프를 빠져나옴
			while ((inputValue = file.read()) != -1) {
				System.out.print((char) inputValue);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}finally {//예외발생여부 관계없이 무조건 발동
			try {
				file.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

		// stream을 형성한 file을 닫음
//		try {
//			file.close();
//		} catch (IOException io) {
//			System.out.println(io.toString());
//		}
	}// main() end
}
