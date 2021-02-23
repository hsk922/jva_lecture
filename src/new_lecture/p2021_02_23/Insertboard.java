package new_lecture.p2021_02_23;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Insertboard {

	public static void main(String[] args) {
		
		Connection con = null;			//데이터베이스 접속 관련
		PreparedStatement pstmt = null; //sql실행 관련
		
		//db연결에 필요한 부분
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		
		try {
			Class.forName(driver);		//jdbc 드라이버를 가장 먼저 로딩해줘야한다. forname 정적매소드
			con = DriverManager.getConnection(url, "scott", "tiger");//connection 객체를 하나 리턴. // getConnection는 정적 매소드이므로 DriverManager.을 이용해 접근
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("작성자 명을 입력하세요");
			String writer = br.readLine();
			System.out.println("비밀번호를 입력하세요");
			String passwd = br.readLine();
			System.out.println("제목을 입력하세요");
			String subject = br.readLine();
			System.out.println("내용을 입력하세요");
			String content = br.readLine();
			
			//sql문 생성
			String sql="insert into board ";//한줄을 두줄로 나눈 상태이므로 나눠진 부분 사이의 띄어쓰기가 되어있는지 확인필요
		sql+="values(board_seq.nextval,?,?,?,?,sysdate)";
			
			pstmt = con.prepareStatement(sql);//객체를 구해와서 물음표에 값을 설정함.//sql문을 실행하는 역할
			pstmt.setString(1, writer);//1부터 시작, 1은 위치 , 각 물음표 할당값.
			pstmt.setString(2, passwd);
			pstmt.setString(3, subject);
			pstmt.setString(4, content);
			
			//어떻게 실행되느냐에 따라 메소드가 두가지. Insert에서는 executeUpdate()를 사용한다. 
			int result = pstmt.executeUpdate();//SQL문 실행.//동시에 수행하지 못하기 때문에 잘 실행되면 1을 리턴함.
			//리턴 값에 따라 문구 표시
			if(result == 1) {
				System.out.println("글 작성 성공");
			}else {
				System.out.println("글 작성 실패");
			}
			
			
			
		}catch(Exception e) { // 잘 모를 경우 Exception만, e : 매개변수 
			e.printStackTrace();
		}finally {
			try {
				if(pstmt !=null) pstmt.close();
				if(con !=null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
