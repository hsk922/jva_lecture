package new_lecture.p2021_02_08;

public class Animal {
	//사용자 정의 클래스 (참조형)
	
	int age;		//필드(field), 멤버변수 (heap 메모리 영역에 저장됨 ) 자동으로 초기값 가짐
					// : 메소드 바깥쪽에 정의되는 변수
	
	public Animal() {	//기본 생성자 : 매개변수가 없는 생성자 (Default Constructor)
						//필드값을 초기화시키는 역할
		System.out.println("생성자 호출 성공!");
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		int a = 10; // 지역변수 ( stack 영역에 저장 )
		
		String str = new String("자바");	//String 객체 생성
		
		Animal 		a1 		= 		new 		Animal();
//		클래스	 레퍼런스변수			연산자		생성자를 호출하는 코드 (생성자x)
		
		
		
		System.out.println("age:" + a1.age);
//		age = 5;		오류발생
		a1.age = 5;
		System.out.println("age 값 변경:" + a1.age);
		
		Animal 		a2 		= 		new 		Animal();
		
		System.out.println("a2의 age:" + a2.age);
		System.out.println();
		
		if (a1.age == a2.age) {
			System.out.println("a1.age와 a2.age는 같은 주소값입니다.");
		} else {
			System.out.println("a1.age와 a2.age는 다른 주소값입니다.");
		}
		
		
		
		
		
		System.out.println();
		System.out.println("졸~");
		Thread.sleep(1500);
		System.out.println("~려");
		Thread.sleep(1500);
		System.out.println("졸~");
		Thread.sleep(1500);
		System.out.println("~려");

	}

}
