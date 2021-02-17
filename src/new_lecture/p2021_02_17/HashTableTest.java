package new_lecture.p2021_02_17;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

class HashTableTest {
	public static void main(String[] args) {
//		Map ht = new Hashtable();			// 업캐스팅인데 하면 오류남
		// 참조가능한 영역이 축소됨,하위클래스에만 있는 메소드 사용불가
		Hashtable ht = new Hashtable();
		
		// 해쉬 테이블에 키/데이터를 입력한다.
//		put(Object key, Object value)
		ht.put("딸기", "StrawBerry");
		ht.put("사과", "Apple");
		ht.put("포도", "Grapes");//value가 String으로 저장되어있음.

		// 해쉬 테이블의 값을 키를 이용하여 얻는다.
		// Object  get(Object key)
		// Object obj = ht.get("포도");
		//Object는 일반적인 변수로 잘 안씀,
		//Object인 경우 현재 저장된 value값인 String으로 다운
		//컴파일러가 자동으로 변환시켜주지않는 경우이므로 (String)은 생략불가
		String Val = (String) ht.get("포도");//다운 캐스팅
		if (Val != null) {
			System.out.println("포도-> " + Val);
		}

		// key를 모르는 경우에 사용하는 방법
//		열거형(Enumeration) : 딸기 사과 포도
//		keys 메소드는 하위클래스인 Hashtable에만 있는 메소드로 업캐스팅시 오류
		Enumeration Enum = ht.keys();//key메소드로 key값 가져옴
		while (Enum.hasMoreElements()) {
			String k = (String)Enum.nextElement();//하나씩 구함
			String v = (String)ht.get(k);//get메소드로 벨류는 구해옴
			System.out.println(k + " : " + v);
		}
	}
}



