package new_lecture.p2021_02_17;

import java.util.TreeSet;

public class practice {

	public static void main(String[] args) {
		System.out.println("1~45 사이의 무작위 숫자 6개를 추출해드립니다.");
		System.out.println();
		System.out.println("행운의 번호는~");
		TreeSet<Integer> lotto = new TreeSet<Integer>();

		for (int i = 0; lotto.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			lotto.add(num);
		}
//		System.out.println(lotto);
//=================================================================		
		for (Integer a : lotto) {
			System.out.print(a + " ");
		}
	}

}
