package new_lecture.p2021_02_09;

import java.util.Arrays;
import java.util.Scanner;

class MemberInfo {	//DTO
	private String name;
	private String age;
//	private int age;
	private String email;
	private String adress;
	
	public MemberInfo() {		
	}
	
	public String getName() {
		return name;
	}
//	public int getAge() {
	public String getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	public String getAdress() {
		return adress;
	}
	public void setName(String name) {
		this.name = name;
	}	
//	public void setAge(int age) {
	public void setAge(String age) {
		this.age = age;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public void Info() {
		System.out.println("이름: "+name + "나이: "+age + "이메일: "+email + "주소: "+adress);
	}
	
}

public class MemberInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberInfo info = new MemberInfo();
		MemberInfo info2 = new MemberInfo();
		String[][] member = new String[2][4];
		member[0][0] = info.getName();
		member[0][1] = info.getAge();
		member[0][2] = info.getEmail();
		member[0][3] = info.getAdress();
		member[1][0] = info2.getName();
		member[1][1] = info2.getAge();
		member[1][2] = info2.getEmail();
		member[1][3] = info2.getAdress();
		
		System.out.println("이름을 입력하세요");
		info.setName(sc.next());
		System.out.println("나이를 입력하세요");
		info.setAge(sc.next());
//		info.setAge(sc.nextInt());	
		System.out.println("이메일을 입력하세요");
		info.setEmail(sc.next());	
		System.out.println("주소를 입력하세요");
		info.setAdress(sc.next());
				
		System.out.println("이름을 입력하세요");
		info2.setName(sc.next());
		System.out.println("나이를 입력하세요");
		info2.setAge(sc.next());
//		info.setAge(sc.nextInt());
		System.out.println("이메일을 입력하세요");
		info2.setEmail(sc.next());		
		System.out.println("주소를 입력하세요");
		info2.setAdress(sc.next());
		
		System.out.println(Arrays.toString(member));
		
		for(int i=0; i<4; i++) {
			System.out.print(member[0][i]);
		}
		
		System.out.println();
		
		info.Info();
		info2.Info();
		
	}

}

