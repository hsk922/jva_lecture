package new_lecture.p2021_02_10;

//final이 클래스에 사용될 경우 >> 상속을 허용하지 않는다는 의미.
final class FinalClass{		//부모 클래스
  String str="Java ";
    public void setStr(String s){
      str=s;
    System.out.println(str);
  }
}
class FinalEx extends FinalClass{    //자식클래스
   int a=10; 
   public void setA(int a)  {
    this.a=a;
   }
   public void setStr(String s){
    str+=s;
    System.out.println(str);
   }
}
public class FinalTest03{
   public static void main(String[] args) {
    FinalEx fe= new FinalEx( );
   }   
}          