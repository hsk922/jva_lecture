package new_lecture.p2021_02_09;

class MyDate06 {
	private int year; // 필드, 멤버변수	//외부에서 접근을 못하기 때문에 캡슐화 역할을 함.
	private int month;
	private int day;

//  public MyDate06(){//default 생성자
//  } 

	public MyDate06(int year, int month, int day) {
		this.year = year;		//	2017
		this.month = month;		//	7
		this.day = day;			//	19
	}

	public int getYear() {				//	getters method
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public void setYear(int year) {		//	setters method
		this.year = year;		//	2018
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void print() {
		System.out.println(year + "/" + month + "/" + day);
	}
}

public class ConstructorTest06 {
	public static void main(String[] args) {
		MyDate06 d = new MyDate06(2017, 7, 19); // 생성자 호출
		d.print();

		d.setYear(2018); // 변경됨
		d.print();

		d.setMonth(8); // 변경됨
		d.print();
		
		d.setDay(15);
		d.print();
		
		System.out.println(d.getYear());
		System.out.println(d.getMonth());
		System.out.println(d.getDay());

	}
}
