package new_lecture.p2021_02_04;

public class Oper10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		증감 연산자
//	    ++      1씩 증가   ++a(선행 처리)  // a=a+1;
//		                a++(후행 처리) // a=a+1;		받는 부분에서 변화 발생.
//													++가 뒤에 있으므로 a를 좌변에 대입하는것을 먼저 실행, ++연산처리를 그 후에 처리함. 
//
//	    --      1씩 감소    --a(선행 처리) // a=a-1;
//		                a--(후행 처리) // a=a-1;
		
		int a=10, b=10, c=10, d=10;
		int a1, b1, c1, d1;
		
		a1 = ++a;		// 선행 연산
		b1 = b++;       // 후행 연산 
		c1 = --c;		// 선행 연산
		d1 = d--;		// 후행 연산
		System.out.println("a1="+a1 +" a="+a);
		System.out.println("b1="+b1 +" b="+b);
		System.out.println("c1="+c1 +" c="+c);
		System.out.println("d1="+d1 +" d="+d);
		
		
		
		
		
		
		
	}

}