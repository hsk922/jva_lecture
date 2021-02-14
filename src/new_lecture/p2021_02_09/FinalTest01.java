package new_lecture.p2021_02_09;

class FinalMember {
	final int a = 10;

	public void setA(int a) {
		this.a = a;
	}
}

public class FinalTest01 {
	public static void main(String[] args) {
		FinalMember ft = new FinalMember();
		final int a = 1000;
		ft.setA(100);
		System.out.println(a);
	}
}
