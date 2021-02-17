package new_lecture.p2021_02_16;

import  packTest.packOne.AccessTest;

//AccessTest의 서브 클래스로 SubOne을 설계
class SubOne extends AccessTest {
  void subPrn( ){
    System.out.println(a); //[1. Sub] private -X
    System.out.println(b); //[2. Sub] 기본 접근 지정자-X
    System.out.println(c); //[3. Sub] protected -O
    System.out.println(d); //[4. Sub] public -0
  }//패키지 달라도 상속관계면 프로텍티드에 접근가능
}

//AccessTest랑 상속관계가 없는 클래스 
class SuperSubA{
  public static void main(String[] args){
    AccessTest at=new AccessTest( );
    at.print( );
    System.out.println("main");
    System.out.println(at.a); //[1. main] private -X
    System.out.println(at.b); //[2. main] 기본 접근 지정자-X
    System.out.println(at.c); //[3. main] protected -X
    System.out.println(at.d); //[4. main] public -O
  }
}