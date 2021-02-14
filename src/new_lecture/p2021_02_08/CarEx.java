package new_lecture.p2021_02_08;

//p201
class Car{	//소스파일은 하나로 되있지만 바이트코드는 클래스별로 나눠져서 생성됨. 컴파일까지는 되지만 독립적으로 실행불가.(메인메소드없음)
	// 필드(field)
	String company = "현대 자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	public Car() {		// 기본 생성자
		System.out.println("생성자 호출 성공");
	}
}

public class CarEx {		//public 접근제한자는 메인메소드를 가지고 있는 클래스에만 사용가능. 1개만 써야함.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 생성
		CarEx car = new CarEx();	//필드,생성자,메소드등 멤버가 없기떄문에 의미없는 작업임.
		Car mycar =  new Car();		//필드,생성자가 있기떄문에 의미있는 작업.//힙에 새로운공간 생성
		System.out.println("제작회사:"+ mycar.company);
		System.out.println("모델명:"+ mycar.model);
		System.out.println("색깔:"+ mycar.color);
		System.out.println("최고속도:"+ mycar.maxSpeed);
		System.out.println("현재속도:"+ mycar.speed);
		
		// 필드값 변경
		mycar.speed = 60;
		System.out.println("수정된 속도:"+ mycar.speed);
	}

}
