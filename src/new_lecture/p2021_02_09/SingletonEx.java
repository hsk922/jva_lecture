package new_lecture.p2021_02_09;
// p244

class Singleton{
	
	// 싱글톤(Singleton) : 객체 생성을 1번만 수행
	private static Singleton s = new Singleton();//1번만 만들고 공유
	//여러개 만들면 시간낭비, 메모리공간 부담, 처리속도+
	
	public static Singleton getInstance() { //정적 메소드 
		return s;							// 클래스이름과 동일, 객체를 리턴
	}
	
	public void check() {
		System.out.println("메소드 호출 성공1");
	}
	public void check1() {
		System.out.println("메소드 호출 성공2");
	}	
}

public class SingletonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
		if(obj1 == obj2) {	// 주소값 비교
			System.out.println("같은 Singleton객체 입니다.");
		}else {
			System.out.println("다른 Singleton객체 입니다.");
		}
		
		obj1.check();
		obj1.check1();
		obj2.check();
		obj2.check1();
	}

}
