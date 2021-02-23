package new_lecture.p2021_02_19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;  // 도스 콘솔 창에서 사용자 입력을 받아들이기 위해 BufferedReader 

class  JDBC_Insert{
public static void main(String[] args) {//자바 가상머신에서 구동해야 하기 떄문에 메인메소드 생성

  String driver = "oracle.jdbc.driver.OracleDriver"; // oracle.jdbc.driver: 패키지명 / OracleDriver: 바이트코드
  String url = "jdbc:oracle:thin:@localhost:1521:xe";//	localhost: ip주소로 입력해도 됨. 1521 : 포트번호

  Connection con = null;	//DB접속 리턴값 저장
  Statement stmt = null;	//try 위쪽에 선언되어야 try, final 사용가능

 // ResultSet  rs   = null;
  String sql;

   String name, email, tel, no ;
  
     try{//예외 발생 가능성이 있는 내용이 들어감.
      Class.forName(driver);//JDBC 드라이버 로딩
      con = DriverManager.getConnection(url, "scott", "tiger" );//DB 접속		con으로 리턴, 
      stmt= con.createStatement();	//statement 객체는 connection을 이용하여 만들고 sql을 실행하는 역할을 함. 

      //---JDBC_Insert 추가된 내용-------
      // 테이블에 추가할 내용을 도스 콘솔 창에서 사용자의 입력을 받도록 한다.
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      System.out.println(" customer 테이블에 값 입력하기 .....");
      System.out.print(" 번호 입력: ");
      no = br.readLine();				//문자 형태로 입력, 숫자형으로 변환시키는게 원칙.(parseInt)
      System.out.print(" 이름 입력: ");
      name = br.readLine();            //테이블에 추가할 name 필드 값을 입력 받음
      System.out.print(" 이메일 입력: ");
      email = br.readLine();             //테이블에 추가할 email 필드 값을 입력 받음
      System.out.print(" 전화번호 입력: ");
      tel = br.readLine();               //테이블에 추가할 tel 필드 값을 입력 받음
      
      // INSERT 쿼리문을 작성
      sql = "INSERT into customer(no, name, email, tel) values " ;//column명을 쓰는 방식 , 주어진 순서대로 자료형에 맞는 값을 입력해야하고 숫자데이터는 ''를 사용하지않음
      //statement를 사용하여 실행하는 방식 , (나중에는 잘 사용하지 않음)
      sql += "(" + no + ",'" + name +"','" + email +"','"+ tel +"')" ;//문자 데이터 양쪽에 외따옴표로 감싸주어야 함 , 복잡함
      
      // DML 
      //Statement 객체의 executeUpdate(sql) 메서드를 이용해 
      int res = stmt.executeUpdate(sql) ;  //데이터베이스 파일에 새로운 값을 추가시킴 // statement 객체를 이용하여 실행
	  if(res == 1){//정상 실행되면 1
		 System.out.println(" Data insert success!! ");
      }else{
		System.out.println(" Data insert failed ");
	  }
	}
    catch(Exception e){// SQLException이 주로 발생
      System.out.println("데이터베이스 연결 실패!");
    }
    finally{//예외발생 여부 관계 없이 실행되고 주로 종료할 때 사용
      try{
 //       if( rs != null )   rs.close();        
        if( stmt != null ) stmt.close();//connection을 먼저 실행했지만 닫을때는 반대로 닫음, finally 바로 안에 사용x try~catch로 감싸야함
        if( con != null )  con.close();
      }
      catch(Exception e){ 
        System.out.println( e.getMessage());
      }
    }
  }
} 
