package new_lecture.p2021_02_09;

class MyDate {	//클래스를 구성하는 필드, 메소드, 생성자 앞에는 접근제한자를 붙일 수 있다.
	private int year;	// field, 멤버변수
	private int month;
	private int day;

	public MyDate() {	// 기본 생성자(Default Constructor) 매개변수가 없는 생성자
		System.out.println("[생성자] : 객체가 생성될 때 자동 호출됩니다.");
	}

	public void print() {	// 메소드(method)
		System.out.println(year + "/" + month + "/" + day);
	}
}// MyDate end

public class ConstructorTest02 {
	public static void main(String[] args) {
		// 생성자는 객체를 생성할 때 호출된다.
		MyDate d = new MyDate();
		d.print();   // 생성자 호출
//	System.out.println(d.year);		//private 접근제한자때문에 접근불가.(private는 같은 클래스 안에서만 접근가능)
//	MyDate dd =  new MyDate();
	}
}


