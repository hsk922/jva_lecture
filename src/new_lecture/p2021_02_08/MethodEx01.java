package new_lecture.p2021_02_08;

public class MethodEx01 {
	//	코드의 재사용성.
	
	// 사용자 정의 메소드
	// 사용자 정의 메소드는 프로그래머가 직접 호출해야만 실행된다.
	static void check() {		// static : 정적 메소드
		System.out.println("메소드 호출 성공");
		return;					// return 생략 가능
	}
	
	//	값 전달에 의한 메소드 호출(Call by Value 방식)
	static void check(int a) { //매개변수(parameter) : int a = 30
		System.out.println("전달된 값:"+ a);	//메소드 종료후 값 초기화
	}
	
	//	메소드 오버로딩(한개의 클래스 안에 동일한 이름의 메소드를 여러개 정의/사용)
	static void check(int a, double d) {	//int=4byte , double=8byte
		double result = a + d;
		System.out.println("전달된 값의 합:" + result);
	}
	
	static void check(char c) {  	// char c = 'A'
		System.out.println("전달된 값:" + c);
	}	
	
	static void check(boolean b) {	// boolean b = true
		System.out.println("전달된 값:" + b);
	}

	//	주소값 전달에 의한 메소드 호출(Call by Reference 방식)
	static void check(String s) { 	// String s = "자바"		String=참조형
								  	// String s = new String("파이썬")
		System.out.println("전달된 값:" + s);
	}
	
	static int check01() {
		System.out.println("출력");
		return 50;					// return문: 메소드를 호출한 곳에 값을 돌려주는 역할
//		System.out.println("출력");  // return문 메소드 가장 마지막 줄에 사용 해야 한다.
	}	
	
	static double check02(int a, double d) {
		double result = a + d;
		return result;
	}	
	
	// main() 메소드는 자바 가상머신(java.exe)으로만 호출된다.
	// main() 메소드는 프로그램머가 직접 호출할 수 없다.
	// main() 메소드가 없는 파일은 컴파일까지만 가능하다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodEx01.check();   		// check() 메소드 호출
		check(30);
		check(10, 20.5);
		check('A');
		check(true);
		check("자바");
		check(new String("파이썬"));	
		check01();		//안에 메시지만 출력되고 리턴값인 50은 처리안됨.
		int result = check01();
		System.out.println();
		System.out.println("돌려 받은 값1:" + result);
		System.out.println();
		System.out.println("돌려 받은 값2:" + check01());
		
		double result2 = check02(50, 3.14);
		System.out.println("돌려 받은 값3:" + result2);
		System.out.println("돌려 받은 값4:" + check02(50, 3.14));
		
	}	
}