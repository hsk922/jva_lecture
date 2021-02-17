package new_lecture.p2021_02_16;

abstract class AbstractClass {			// 추상 클래스
	int a=10;
	//일반 클래스는 추상메소드를 가질 수 없다.
	abstract void Method01();			// 추상 메소드
	
	void Method02() {					// 일반 메소드
		System.out.println("Method02:  추상클래스에서 구현");
	}
}

// 추상클래스를 상속받으면, 추상 클래스 안에 있는 추상 메소드를 자식 구현 클래스에서
// 반드시 메소드 오버라이딩을 해야 한다.
class SubClass01 extends AbstractClass {	// 자식 클래스
//다중상속을 할 수없는 문제때문에 인터페이스를 많이 사용함
	@Override							// 
	void Method01() {					// 메소드 오버라이딩
		// TODO Auto-generated method stub
		System.out.println("Method01: 서브클래스에서 구현된 추상메소드");
	}	
}

class AbstractTest01 {
	public static void main(String args[]) {
		// 추상 클래스는 자체적으로 객체 생성을 할 수 없다.
//		AbstractClass abs = new AbstractClass();   //오류 발생
		
		SubClass01 obj = new SubClass01();
		obj.Method01();		// 오버라이딩된 메소드가 호출된다.
		obj.Method02();     // 상속받은 Method02()메소드가 호출된다.
	}
}




