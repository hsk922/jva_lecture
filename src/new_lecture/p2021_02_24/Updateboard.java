package new_lecture.p2021_02_24;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Updateboard {

	public static void main(String[] args) {
		
		Connection con = null;			//데이터베이스 접속 관련
		PreparedStatement pstmt = null; //sql실행 관련
		
		String driver ="com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost/jsptest";
		
		
		try {
			Class.forName(driver); // jdbc 드라이버를 가장 먼저 로딩해줘야한다. forname 정적매소드
			con = DriverManager.getConnection(url, "jspid", "jsppass");// connection 객체를 하나 리턴. // getConnection는 정적
																	// 매소드이므로 DriverManager.을 이용해 접근
			
			//키보드 입력값을 받기 위해 BufferedReader 객체 생성
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("수정할 글 번호를 입력하세요");
			String no = br.readLine();
			int ino = Integer.parseInt(no);
			System.out.println("작성자명을 입력하세요");
			String writer = br.readLine();
			System.out.println("비밀번호를 입력하세요");
			String passwd = br.readLine();
			System.out.println("제목을 입력하세요");
			String subject = br.readLine();
			System.out.println("내용을 입력하세요");
			String content = br.readLine();
			
			//수정하기 위한 sql문 작서
			String sql = "update board set writer=?, passwd=?, subject=?, ";
			sql+= "content=?, reg_date=sysdate() where no=?";//reg_date=sysdate << 수정된 날짜로 가져올때
			//where절은 보통 중복값이 없는 primary key가 선언되어있는것이 옴
			//reg_date가 만약?로 되어있으면 timestamp로 사용해야함
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, writer);
			pstmt.setString(2, passwd);
			pstmt.setString(3, subject);
			pstmt.setString(4, content);
			pstmt.setInt(5, ino);
			
			int result = pstmt.executeUpdate();
			if(result == 1) {
				System.out.println("글 수정 성공");
			}else { 
				System.out.println("글 수정 실패");
			}
			
		} catch (Exception e) { // 잘 모를 경우 Exception만, e : 매개변수
			e.printStackTrace();
		} finally {//정상수행시 오토커밋
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) pstmt.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
