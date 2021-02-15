package new_lecture.p2021_02_15;

public class InsertStringBuffer {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("gemini is beautiful");
		System.out.println(sb1);

		sb1.insert(10, "very");	//첫번째 10은 인덱스 위치를 말함.
		System.out.println(sb1);//append는 뒤에, insert는 위치 지정해서 삽입

		sb1.insert(0, 1004);
		System.out.println(sb1);
	}
}
