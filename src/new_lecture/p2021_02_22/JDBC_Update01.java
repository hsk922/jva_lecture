package new_lecture.p2021_02_22;

// 도스 콘솔 창에서 사용자 입력을 받아들이기 위해 BufferedReader 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class  JDBC_Update01{
public static void main(String[] args) {

  String driver = "oracle.jdbc.driver.OracleDriver";
  String url = "jdbc:oracle:thin:@localhost:1521:xe";

  Connection con = null;
  PreparedStatement pstmt =  null;

  String sql;
  String name, email, tel ;
  int ino;
  
     try{
      Class.forName(driver);
      con = DriverManager.getConnection(url, "scott", "tiger" );      

      //---JDBC_Insert 추가된 내용-------
      // 테이블에 추가할 내용을 도스 콘솔 창에서 사용자의 입력을 받도록 한다.
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println(" customer 테이블에 값 갱신하기 .....");
      System.out.print("수정할 회원의 회원번호를 입력? ");
      ino = Integer.parseInt(br.readLine());
      
      System.out.print("변경할 이름을 입력:");
      name = br.readLine();            //테이블에 추가할 name 필드 값을 입력 받음
      System.out.print("변경할 이메일 입력: ");
      email = br.readLine();             //테이블에 추가할 email 필드 값을 입력 받음
      System.out.print("변경할 전화번호 입력: ");
      tel = br.readLine();               //테이블에 추가할 tel 필드 값을 입력 받음     
    //update 테이블명 set 컬럼명 값자리에는 ?만. where 조건절 사용시 primary key로 설정된것이 들어감.
	  sql = "UPDATE customer SET name=?, email = ?, tel = ? where no = ?";
	  pstmt = con.prepareStatement( sql );//sql을 읽어와서 생성.
	  pstmt.setString(1, name);//타입에 맞게 세팅
	  pstmt.setString(2, email);
	  pstmt.setString(3, tel);
	  pstmt.setInt(4, ino);
      int result=pstmt.executeUpdate(); 
      if(result==1){
    	  System.out.println("데이터 수정 성공");
      }else{
    	  System.out.println("데이터 수정 실패");
      }
	}
    catch(Exception e){//타입 잘못 입력할 떄 NumberFormatException 발생
      System.out.println("데이터베이스 연결 실패!");
    }
    finally{
      try{
        if( pstmt != null ) pstmt.close();
        if( con != null )  con.close();
      }
      catch(Exception e){ 
        System.out.println( e.getMessage());
      }
    }
  }
} 
