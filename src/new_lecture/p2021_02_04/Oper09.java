package new_lecture.p2021_02_04;

public class Oper09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		확장 대입 연산자 (복합 대입연산자)
//	     +=, -=, *=, /=, %=
//
//	    	    a+=b;	// a = a + b;	//풀어서 생각하기, +가 앞에 왔기때문에 +를 먼저 처리
//	            a-=b; 	// a = a - b;
//	            a*=b; 	// a = a * b;
//	            a/=b; 	// a = a / b;
//	            a%=b;	// a = a % b;
		
		int a = 10, b = 3;
		System.out.println(a += b); // a=a+b  13 
		System.out.println(a -= b); // a=a-b  10 
		System.out.println(a *= b); // a=a*b  30 
		System.out.println(a /= b); // a=a/b  10 
		System.out.println(a %= b); // a=a%b  1 

	}

}
