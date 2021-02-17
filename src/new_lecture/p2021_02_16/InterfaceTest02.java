package new_lecture.p2021_02_16;

interface IHello02 {
	public abstract void sayHello(String name);	//추상 메소드
}

interface IGoodBye02 {
	public abstract void sayGoodBye(String name);
}
//두 인터페이스로부터 상속을 받는 클래스 설계
class SubClass implements IHello02, IGoodBye02 {
	public void sayHello(String name) {
		System.out.println(name + "씨 안녕하세요!");
	}

	public void sayGoodBye(String name) {
		System.out.println(name + "씨 안녕히 가세요!");
	}
}

class InterfaceTest02 {
	public static void main(String[] args) {
		SubClass test = new SubClass();
		test.sayHello(args[0]);
		test.sayGoodBye(args[0]);
	}
}       