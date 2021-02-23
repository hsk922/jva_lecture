package new_lecture.p2021_02_23;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Deleteboard {

	public static void main(String[] args) {
		
		Connection con = null;			//데이터베이스 접속 관련
		PreparedStatement pstmt = null; //sql실행 관련
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			//삭제할 글 번호 받기
			System.out.println("삭제할 글 번호를 입력하세요");
			int no = Integer.parseInt(br.readLine());
			//문자 입력시 NumberformatException 발생, catch로 넘겨 문구 출력
			
			//글을 삭제할 delete sql 작성
			String sql = "delete from board where no = ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);//?로 되어있기때문에 setInt
			
			int result = pstmt.executeUpdate();
			if(result == 1) {
				System.out.println("글 삭제 성공");
			} else {
				System.out.println("글 삭제 실패");
			}

			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("글 번호를 입력하세요.");// << 문자 입력시 예외 발생으로 추가 
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}

	}

}
