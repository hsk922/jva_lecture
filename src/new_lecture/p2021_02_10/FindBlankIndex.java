package new_lecture.p2021_02_10;

public class FindBlankIndex {
	public static void main(String[] args) {

		String message = "Java program creates many objects.";

		// message의 길이를 구함.
		// .length	: 배열의 크기 구할때.
		// length() : 문자열의 길이를 구해준다. 글자수를 구해줌 (메소드)
		// size()	: collection 안의 원소의 개수 구할때. 02-04 Variable.java
		int len = message.length();

		System.out.println(len); // len = 34;

		// message 중에서 ' '을 찾음
		for (int i = 0; i < len; i++) {
			char c = message.charAt(i);
			if (c == ' ') { // 공백
				System.out.println("index = " + i);
			}
		} // for end
	}
}
