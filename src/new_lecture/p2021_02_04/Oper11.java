package new_lecture.p2021_02_04;

public class Oper11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 증감 연산자 : ++, --
		
		int a=10, b=10;
		
		System.out.println("a=" + a++);  // 후행연산  a=10	System.out.println()으로 대입하는것을 먼저 처리, 그 후 ++연산 처리.
		System.out.println("a=" + a);    // a=11			++연산이 처리된 상태이므로 11로 출력됨.
		
		System.out.println("b=" + (++b)); //선행연산 b=11
		System.out.println("b=" + b);     // b=11
		
	}

}
