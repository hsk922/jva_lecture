package new_lecture.p2021_02_17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<MemberInfo> li = new ArrayList<MemberInfo>();
//				이거만 저장하겠다는 선언
//		MemberInfo mm;
		String yn;

		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("성명을 입력하세요? ");
			String name = sc.nextLine();
			System.out.print("나이를 입력하세요? ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("E-Mail을 입력하세요? ");
			String email = sc.nextLine();
			System.out.print("주소를 입력하세요? ");
			String address = sc.nextLine();
//=============================================================
			MemberInfo m = new MemberInfo();
//			 m.name="홍길동";
			m.setName(name);
			m.setAge(age);
			m.setEmail(email);
			m.setAddress(address);

//			add(Object e)
			li.add(m);		//  업캐스팅
//=============================================================
			System.out.println("계속할려면 y, 멈출려면 n을 입력?");
			yn = sc.next();
			if (yn.equals("y")) {
				continue;
			} else if (yn.equals("n")) {
				break;
			}
			sc.close();

		} while (true);

//		Object get(int index)
		for (int i = 0; i < li.size(); i++) {
			MemberInfo mm = (MemberInfo) li.get(i);// 다운 캐스팅
//			리스트에 있는 자료형인 MemberInfo로 캐스팅
//			(MemberInfo)는 다운캐스팅때 생략불가능하지만 제네릭을 사용할 경우는 가능
			System.out.println("성명:" + mm.getName());
			System.out.println("나이:" + mm.getAge());
			System.out.println("E-Mail:" + mm.getEmail());
			System.out.println("주소:" + mm.getAddress());
		}
	}

}

// DTO(Data Transfer Object)
class MemberInfo extends Object{//extends Object는 자동으로 되있으므로 생략가능
	private String name;
	private int age;
	private String email;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {	//setter가 생성자 역할을 대신함.
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
