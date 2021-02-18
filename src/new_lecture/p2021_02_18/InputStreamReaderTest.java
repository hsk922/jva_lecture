package new_lecture.p2021_02_18;

import java.io.*;

public class InputStreamReaderTest {
    public static void main( String[] args ) {
    	
	// byte Stream인 is 선언	//	1byte짜리를 입력받을 수 있음
	InputStream is = System.in;//정적 필드//표준입력장치가 키보드.
	
	// InputStreamReader 객체 선언
	InputStreamReader isr = new InputStreamReader( is );
//							InputStreamReader(System.in);
	int inputValue = 0;
	System.out.print( "Input Value : " );
	try {
		// 키보드로 부터 데이터를 입력
		//2바이트씩 읽어들이기 때문에 한글은 1자 밖에 입력이 안됨.
		inputValue = isr.read();//read가 예외처리를 요구함.
	} catch ( IOException io ) {
		System.out.print(io.getMessage());
	}
	// 여러 글자를 받는 방법은 배열로 할 수 있음.
	// 입력받은 데이타를 출력
System.out.println( "Input Result : " + inputValue );
System.out.println( "Input Result : " + (char)inputValue );
    }
}
