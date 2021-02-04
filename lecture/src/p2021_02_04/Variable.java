package p2021_02_04;

import java.util.ArrayList;
import java.util.List;

public class Variable {

	public static void main(String[] args) {
		
		// 변수 : 메모리 상에 데이터를 저장하기 위한 기억 공간
		// 변수를 만드는 형식 : 자료형 변수명 = 데이터(값);
		// 지역변수는 스택영역에 저장
		
		// 기본 자료형			
		// 1. 정수형 변수
			byte b1 = 10;		//	-128 ~ 127
			short s = 100;		//	-32768 ~ 32767
			int i = 1000;		//	약 -21억 ~ 21억
			long l = 10000;		//	-
			
			System.out.println("b1= " + b1);
			System.out.println("s= " + s);
			System.out.println("i= " + i);
			System.out.println("l= " + l);

		// 2. 실수형 변수
			float ft1 = 3.14f;		//	float형은 f를 붙여야 한다. (대소문자 상관 X) , 소수점이 길어지면 안정성이 떨어짐.
			double d = 42.195;		//	소수점 16자리까지 지원가능
			
			System.out.println("ft1: " + ft1);
			System.out.println("d: " + d);
			System.out.printf("%.1f\n" , d);		//	소수점 첫쨰자리까지 출력
			System.out.printf("%.2f\n" , d);		//	소수점 둘쨰자리까지 출력
			
		// 3. 문자형 변수
			char c1 = 'A';
			char c2 = '안';
			
			System.out.println("c1= " + c1);
			System.out.println("c2= " + c2);
			
		// 4. 논리형 변수
			boolean bn1 = true;
			boolean bn2 = false;
			System.out.println("bn1: " + bn1);
			System.out.println("bn2: " + bn2);
			
		// 참조형 : 배열, 클래스, 인터페이스(Collection) >>  참조형은 힙 메모리에만 데이터 저장
			
		// 5. 참조형 변수 : 배열 - 동일한 자료형의 데이터를 저장하는 정적인 자료구조
			
		// for(초기값; 조건식; 증감식)
			int[] score = {80, 90, 100};
			for(int j=0; j<score.length; j++) {
				System.out.print(score[j]+ "\t");
			}
			System.out.println();
		// 6. 참조형 변수 : 클래스
			String s1 = "자바";
			String s2 = new String("자바");
			System.out.println("s1= " + s1);
			System.out.println("s2= " + s2);
			
			if( s1==s2) { // 주소값 비교
				System.out.println("같은 주소");
			} else { 
				System.out.println("다른 주소");
			}
			
			if(s1.equals(s2)) { // 데이터 값 비교
				System.out.println("같은 값");
			} else {
				System.out.println("다른 값");
			}
			
			
		// 7. 참조형 변수 : 인터페이스(List)
		//	1) 순차적인 자료 
		//	2) 여러가지 자료형의 데이터를 모두 저장할 수 있다.
		//	3) 동적으로 공간의 크기를 늘릴 수 있다.
			
		//	List list = new List();		(X)		<< 인터페이스는 자체적으로 객체 생성 불가
		//	https://docs.oracle.com/javase/8/docs/api/ 8버젼이 더 보기 좋아서 이용.	
			
			List list = new ArrayList();		// 형 변환 (업캐스팅) 왼쪽과 오른쪽이 다름.
			
//			ArrayList li = new ArrayList();
			list.add(30);
			list.add(3.14);
			list.add('j');
			list.add(true);
			list.add("자바");
			System.out.println(list);
			System.out.println(list.get(1));
			
			for(int k=0; k<list.size(); k++) {
				System.out.print(list.get(k) + "\t");		//	\t  : 수평간격 벌리기 (tap키 값만큼)
			}
			
			
	}

}
