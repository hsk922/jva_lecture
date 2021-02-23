package new_lecture.p2021_02_23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Selectboard {

	public static void main(String[] args) {
		
		Connection con = null;			//데이터베이스 접속 관련
		PreparedStatement pstmt = null; //sql실행 관련
		ResultSet rs01 = null;
		ResultSet rs02 = null;
		int count = 0; 					//총 데이터 갯수를 저장
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		
		
		try {
			Class.forName(driver);		//jdbc 드라이버를 가장 먼저 로딩해줘야한다. forname 정적매소드
			con = DriverManager.getConnection(url, "scott", "tiger");//connection 객체를 하나 리턴. // getConnection는 정적 매소드이므로 DriverManager.을 이용해 접근
			
			//전체 목록을 검색하기 위한 sql 문을 생성
			String sql = "select * from board order by no desc"; //order by no desc 최신글이 위로가도록 정렬
//			select sql문을 두번 사용할 예정 1. board테이블 안의 모든 데이터를 검색 / 2. 
			
			//sql문을~~  prepareStatement객체 생성
			pstmt = con.prepareStatement(sql);
			//prepareStatement를 이용하여 sql문 실행 , select는 executeQuery()로 실행, ResultSet을 돌려줌
			rs01 = pstmt.executeQuery();
			
			//1. board테이블 안의 모든 데이터를 검색 
			System.out.println("번호\t작성자명\t비밀번호\t제목\t내용\t\t날짜");
			System.out.println("------------------------------------------------------------");
			//한꺼번에 데이터를 처리하지 못하기 때문에 next메소드를 통해 하나씩 처리
			while(rs01.next()) {//컬럼단위로 잘라주는 수행을 해야함.
				int no = rs01.getInt("no");//컬럼의 자료형에 따라 매소드가 정해져있음.
				String writer = rs01.getString("writer");
				String passwd = rs01.getString("passwd");
				String subject = rs01.getString("subject");
				String content = rs01.getString("content");
				Timestamp ts = rs01.getTimestamp("reg_date");
				
				System.out.println(no+"\t"+writer+"\t"+passwd+"\t"+subject+"\t"+content+"\t"+sd.format(ts));
			}
			//2. 총 데이터 갯수 출력
			sql = "select count(*) from board"; //그룹함수
			pstmt = con.prepareStatement(sql);//
			rs02 = pstmt.executeQuery();
			//데이터가 하나밖에 없으므로 if 사용
			if(rs02.next()) {
				count = rs02.getInt(1);
//				count = rs02.getInt("count(*)"); // 둘중 하나만 사용
			}
			System.out.println("총 데이터 수:"+count);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs01 != null) rs01.close();
				if(rs02 != null) rs02.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
