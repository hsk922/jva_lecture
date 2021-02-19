package new_lecture.p2021_02_19;

import java.sql.*;

public class JDBC_Connect02{

  public static void main(String[] args)  {

/** ORACLE JDBC Driver Test *****************************************/
	String driver = "oracle.jdbc.driver.OracleDriver"; 
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
/*******************************************************************/

/** My-SQL JDBC Driver *********************************************/
//	String driver ="com.mysql.jdbc.Driver";
//	String url = "jdbc:mysql://localhost/academy";
/*******************************************************************/

    Connection con = null;

    try{
//23라인, 26라인은 공통적으로 해야되는 부분.
    //JDBC Driver 방식 , 암호가 노출되기때문에 잘 사용하지 않음
      Class.forName(driver);

/**   ORACLE에서 Connection 객체 ***********************************/
    con = DriverManager.getConnection(url, "scott", "tiger" );
/*******************************************************************/

/**   My-SQL에서 Connection 객체 ***********************************/
//	  con = DriverManager.getConnection(url, "totoro", "1234" );
/*******************************************************************/

		System.out.println("데이터베이스 연결 성공~!!");

    } catch(Exception e){
		System.out.println("데이터베이스 연결 실패~!!");
		e.printStackTrace();
    } finally{
		try{
			if( con != null )         con.close();
		} catch(Exception e){
			System.out.println( e.getMessage( ));  
        }
   }
 }
}  
