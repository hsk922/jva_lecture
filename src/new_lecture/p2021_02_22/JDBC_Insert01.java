package new_lecture.p2021_02_22;

import java.io.BufferedReader; // 도스 콘솔 창에서 사용자 입력을 받아들이기 위해 BufferedReader 
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class JDBC_Insert01 {//no값이 중복되지 않도록 입력.
	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		Connection con = null;
		PreparedStatement pstmt = null;

		//ResultSet rs = null;
		String sql;

		String name, email, tel, no;//키보드 입력값을 받기 위한 변수

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");

			// ---JDBC_Insert 추가된 내용-------
			// 테이블에 추가할 내용을 도스 콘솔 창에서 사용자의 입력을 받도록 한다.
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));

			System.out.println(" customer 테이블에 값 입력하기 .....");
			System.out.print(" 번호 입력: ");
			no = br.readLine();//table부분에 보면 number타입으로 정해져있기 때문에 숫자로 들어가야함
			System.out.print(" 이름 입력: ");
			name = br.readLine(); // 테이블에 추가할 name 필드 값을 입력 받음
			System.out.print(" 이메일 입력: ");
			email = br.readLine(); // 테이블에 추가할 email 필드 값을 입력 받음
			System.out.print(" 전화번호 입력: ");
			tel = br.readLine(); // 테이블에 추가할 tel 필드 값을 입력 받음

			int ino = Integer.parseInt(no); //숫자가 들어가야 하기 때문에 형변환.

			// INSERT 쿼리문을 작성		(no, name, email, tel) << 컬럼부분 생략가능
			sql = "INSERT into customer (no, name, email, tel) values (?, ?, ?, ?)";//값이 들어갈 자리에 ? 로 표시
			// 외따옴표를 사용하지 않기 때문에 statement로 처리할 때 보다 간결하게 처리가능.
			pstmt = con.prepareStatement(sql);// sql문을 읽어와서 pstmt를 설정
			pstmt.setInt(1, ino);//number타입으로 설정 = Int / varchar2타입 = String
			pstmt.setString(2, name);//set : 값을 설정하는 매소드
			pstmt.setString(3, email);//prepareStatement로 갑을 가져올때는 set을 사용
			pstmt.setString(4, tel);
			int result=pstmt.executeUpdate(); //INSERT SQL 실행
			if(result == 1){
				System.out.println("데이터 입력 성공");
			}else{
				System.out.println("데이터 입력 실패");
			}

		} catch (Exception e) {
			System.out.println("데이터베이스 연결 실패!");
		} finally {
			try {
		//		if (rs != null)
		//			rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
