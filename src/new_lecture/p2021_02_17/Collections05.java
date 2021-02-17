package new_lecture.p2021_02_17;

import java.util.Vector;

class Collections05 {
	public static void main(String[] args) {

// 제네릭을 사용하지 않으면 여러가지 자료형의 자료를 모두 저장할 수 있다
//	add메소드가 최상위객체인 Object에 있기 때문에 모든 자료형 가능
		Vector vec = new Vector();
		vec.add("Apple");
		vec.add("banana");
		vec.add("oRANGE");
//		vec.add(50);
//		vec.add(3.14);
//		vec.add('k');
//		vec.add(true);

		//값을 꺼낼 때
//		Object  get(int index)
		String temp;
		for (int i = 0; i < vec.size(); i++) {
			temp = (String) vec.get(i); // 다운 캐스팅
//			temp = vec.get(i);			// 오류 발생
			
			System.out.println(vec.get(i));
			System.out.println(temp.toUpperCase());
		}
	}
}
