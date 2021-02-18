package new_lecture.p2021_02_18;

import java.io.*;

public class FileReaderTest {
    public static void main( String[] args ) {
    //1byte, 2byte 상관없이 불러올 수 있음
	// FileReader 객체 선언
	FileReader file = null;
	int inputValue = 0;
		
	try {
	    // "data.txt" File과 stream 형성
	    file = new FileReader( "d:/data.txt" );//상대경로
	    //파일객체 생성하는 부분에서 예외처리를 요구하기때문에 
	    //이 부분은 try안에 들어가 있어야 한다.

	    // file의 끝을 만날 때까지 데이터를 읽어 들임
	    while(( inputValue = file.read() ) != -1 ) {
			System.out.print(( char )inputValue );
	    }


	    // stream을 닫음
	    file.close();
	} catch ( Exception e ) {
	    System.out.println( e.toString() );
	}
    }//main() end
}
