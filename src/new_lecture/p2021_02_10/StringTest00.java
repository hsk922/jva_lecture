package new_lecture.p2021_02_10;

class StringTest00 {
	public static void main(String[] args) {
		// new 연산자 사용
		// new연산자 사용시 힙메모리에 공간 생성 (new = 새로운공간만든다)
		String str1 = new String("Java Programming");
		String str2 = new String("Java Programming");
		if (str1 == str2) {		// 주소비교
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		// new 연산자 없음
		// 저장되는 값이 같은 경우 힙에 한번만 생성됨 
		String str3 = "Java Programming";
		String str4 = "Java Programming";
		if (str3 == str4) {		// 주소비교
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if(str1.equals(str3)) {	// 값 비교 boolean값으로 리턴.
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");
		}
		
	}
}