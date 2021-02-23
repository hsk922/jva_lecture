package new_lecture.p2021_02_22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class JDBC_Select01 {
	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";//xe 데이터베이스 연결 정보

		Connection con = null;
		PreparedStatement pstmt = null;
		
		// ---JDBC_Select 추가된 내용 -------
		ResultSet rs = null;
		ResultSet rs01 = null;
		int no = 0;
		String name, email, tel; // 데이터베이스에서 얻어온 필드값 저장할 변수 선언
		String sql; // SQL문을 저장할 변수 선언
		int cnt=0;	// 회원수 저장
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
			//count(*) : 총 갯수를 구해줌 (그룹함수)
			String sql01="select count(*) from customer";//총 데이터 갯수를 구해주는 SQL
			pstmt = con.prepareStatement(sql01);
			rs01 = pstmt.executeQuery();//select문 실행, // 검색결과를 관리하는것이 ResultSet
			if(rs01.next()){//count 함수가 값을 하나만 가져오기 떄문에 if 문은 한번만.
				cnt = rs01.getInt(1);
		//		cnt = rs01.getInt("count(*)"); // 둘 중 하나 사용
			}
			System.out.println("총회원수:"+cnt);
			
			// ---JDBC_Select 추가된 내용 -------
			sql = "SELECT * FROM customer";//검색하는 내용
			System.out.printf("번호 \t 이름 \t\t 이메일 \t\t 전화번호 \n");
			System.out.printf("-----------------------------------------------------------------\n");
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); // 얻어진 레코드를 가져옴

			while (rs.next()) {
				no = rs.getInt("no");
				name = rs.getString("name");
				email = rs.getString("email");
				tel = rs.getString("tel");
				System.out.printf(" %d \t %s \t %s \t %s\n", no, name, email,
						tel);
			}
		} catch (Exception e) {
			System.out.println("데이터베이스 연결 실패!");
		} finally {
			try {// rs, stmt, con 객체를 close() 메서드를 호출해 해제
				if (rs != null)
					rs.close();
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
