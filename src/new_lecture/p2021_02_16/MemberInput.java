package new_lecture.p2021_02_16;

import java.util.Scanner;

public class MemberInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberInfo[] a = new MemberInfo[1];
		int j = 0;
		String name = null, email = null, address = null;
		int age = 0;
		for(int i=0; i<a.length;i++) {
			System.out.print("성명을 입력하세요? ");
			name = sc.nextLine();
			System.out.print("나이를 입력하세요? ");
			age = sc.nextInt();
			sc.nextLine();	    
			System.out.print("E-Mail을 입력하세요? ");
			email = sc.nextLine();			
			System.out.print("주소를 입력하세요? ");
			address = sc.nextLine();	
		}
		a[j] = new MemberInfo(name, age, email, address);
		
		
		System.out.println(a[j].getName());
		
		
	}

}

class MemberInfo {
	private String name;
	private int age;
	private String email;
	private String address;
	
	public MemberInfo(String name, int age, String email, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
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