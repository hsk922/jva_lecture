package new_lecture.p2021_02_19;

import java.sql.*;

class  JDBC_Select{
  public static void main(String[] args)  {

	String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:xe";

    Connection con  = null;
    Statement  stmt = null;
    //---JDBC_Select 추가된 내용 -------
    ResultSet  rs   = null;//검색결과를 돌려받는 부분 , Select만 사용
	int no = 0; 
    String name, email, tel;  //데이터베이스에서 얻어온 필드값 저장할 변수 선언
    String sql;               //SQL문을 저장할 변수 선언

    try{
      Class.forName(driver);
      con = DriverManager.getConnection(url, "scott", "tiger" );//url에 설정된 xe 데이터베이스에 커넥션.
      stmt= con.createStatement();//Statement로 연결하는 방식
      
      //---JDBC_Select 추가된 내용 -------
      sql = "SELECT * FROM customer order by no asc";//대소문자 구분x, order by 컬럼값, asc 오름차순 desc 내림차순
      System.out.printf("번호 \t 이름 \t\t 이메일 \t\t 전화번호 \n");//printf:서식값 출력할때 사용, ln해도 됨
      System.out.printf("-----------------------------------------------------------------\n");
      rs = stmt.executeQuery(sql);  //얻어진 레코드를 가져옴//검색된 결과를 관리

      //데이터가 여러개일 경우 루프를 아용해서 가져옴
      while( rs.next() ){//데이터를 하나씩 가져와서 boolean으로 리턴// 컬럼단위로 쪼갬.
		 no = rs.getInt("no"); //int 로 저장
         name = rs.getString("name");  
         email = rs.getString("email");     
         tel   = rs.getString("tel"); 
        System.out.printf(" %d \t %s \t %s \t %s\n", no, name,email,tel);
      } 
    }
    catch(Exception e){
      System.out.println("데이터베이스 연결 실패!");
    }
    finally{
      try{//rs, stmt, con 객체를 close() 메서드를 호출해 해제
        if( rs != null )      rs.close();        //나중에 실행된 순서대로 닫아줌
        if( stmt != null )    stmt.close();
        if( con != null )     con.close();
      }
      catch(Exception e){
        System.out.println( e.getMessage( ));  
      }
    }
  }
}  

