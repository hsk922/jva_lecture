package new_lecture.p2021_03_08;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

class CallableStatementTest {

	public static void main(String[] args) {
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String sql = null;
		CallableStatement cs = null;
//		PreparedStatement 로 보통 실행하지만 여기는 CallableStatement를 사용한다.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, "scott", "tiger");

			sql = "{call del_all()}"; // del_all 프로시저

			// CallableStatement를 객체를 생성
			cs = con.prepareCall(sql);
			cs.execute();// CallableStatement의 경우는 execute()를 사용.
			
			cs.close();//finaly 안에서 닫아두는게 일반적이지만 여기서 해도 상관없다.
			con.close();//finaly 안에서 닫아두는게 일반적이지만 여기서 해도 상관없다.
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
