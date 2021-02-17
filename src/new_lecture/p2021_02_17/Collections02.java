package new_lecture.p2021_02_17;

import java.util.ArrayList;
import java.util.List;

class Collections02 {

	public static void main(String[] args) {
//		List 인터페이스는 자체적으로 객체 생성을 할 수 없다.
//		List li = new List();
//  	List li = new ArrayList();			// 업캐스팅
//		업캐스팅의경우 참조범위가 줄어들어 의미가 달라질 수 있어 안되는 경우가 있음.
		ArrayList list = new ArrayList();
	
//		boolean add(Object e)
		list.add("하나");
		list.add(2);
		list.add(2);
		list.add(3.42);
		list.add("넷");
		list.add("five");
		list.add(6);

		System.out.println(list);

	}
}
