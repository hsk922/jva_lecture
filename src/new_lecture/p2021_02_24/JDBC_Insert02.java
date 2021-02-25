package new_lecture.p2021_02_24;

import java.io.BufferedReader; // 도스 콘솔 창에서 사용자 입력을 받아들이기 위해 BufferedReader 
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

class JDBC_Insert02 {
	public static void main(String[] args) {

		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost/jsptest";

		Connection con = null;
		PreparedStatement pstmt = null;

		// ResultSet rs = null;
		String sql;

		String name, email, tel, no, address;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "jspid", "jsppass");

			// ---JDBC_Insert 추가된 내용-------
			// 테이블에 추가할 내용을 도스 콘솔 창에서 사용자의 입력을 받도록 한다.
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println(" customer 테이블에 값 입력하기 .....");
//      System.out.print(" 번호 입력: ");
//      no = br.readLine().trim();	  /
			System.out.print(" 이름 입력: ");
			name = br.readLine().trim(); // 테이블에 추가할 name 필드 값을 입력 받음
			System.out.print(" 이메일 입력: ");
			email = br.readLine().trim(); // 테이블에 추가할 email 필드 값을 입력 받음
			System.out.print(" 전화번호 입력: ");
			tel = br.readLine().trim(); // 테이블에 추가할 tel 필드 값을 입력 받음
			System.out.println("주소를 입력 하세요?");
			address = br.readLine().trim();
//	  int ino = Integer.parseInt(no);

			Timestamp ts = new Timestamp(System.currentTimeMillis());
			// date , timestamp , calendar
			// INSERT 쿼리문을 작성		
			//no컬럼은 auto_increment를 사용할 것이기 때문에 값을 입력하면 안된다.
			//그에 따라 아래의 customer_no_seq.nextval,도 빠진다.
			sql = "INSERT into customer(name, email, tel, address, reg_date) ";
			sql += "values( ?, ?, ?, ?, sysdate())";
			// 두줄로 나눌 때 분리되는부분에 공백이 없어지지않도록 해야한다.
			// ? 자리에 직접 값이 들어가야함.
			// reg_date는 5번 항목에 Timestamp를 이용하여 값을 받는 상태.
			// 추후에는 오라클에서 제공하는 함수를 이용함.(sysdate)
			// sysdate : 오라클에서는 괄호가 없는 함수, 대소문자 구분x

			pstmt = con.prepareStatement(sql);
//	  pstmt.setInt(1, ino);	//첫번째 물음표가 없어졌기 때문에 없어져야함.
			pstmt.setString(1, name);// ?가 하나 없어져서 번호를 수정해야한다.
			pstmt.setString(2, email);
			pstmt.setString(3, tel);
			pstmt.setString(4, address);
//	  pstmt.setTimestamp(5, ts);
			int result = pstmt.executeUpdate();
			if (result == 1) {
				System.out.println(" Data insert success!! ");
			} else {
				System.out.println(" Data insert failed ");
			}
		} catch (Exception e) {
			System.out.println("데이터베이스 연결 실패!");
//      e.printStackTrace();//오류가 날때 콘솔창에 출력시켜 원인을 찾을 때 사용
		} finally {
			try {
//			if( rs != null )   rs.close();        
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
