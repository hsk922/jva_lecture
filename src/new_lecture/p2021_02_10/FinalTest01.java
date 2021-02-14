package new_lecture.p2021_02_10;

class FinalMember {
	final int a = 10;	//변수가 아닌 상수가 됨, 값 수정불가.

	public void setA(int a) {
		this.a = a;		//수정시도 >> 불가
	}
}

public class FinalTest01 {
	public static void main(String[] args) {
		FinalMember ft = new FinalMember();
		final int a = 1000;
		ft.setA(100);	//100으로 값 수정시도
		System.out.println(a);
	}
}
