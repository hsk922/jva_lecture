package new_lecture.p2021_02_17;

import java.util.TreeSet;

public class practice {

	public static void main(String[] args) {
		System.out.println("1~45 사이의 무작위 숫자 6개를 추출해드립니다.");
		TreeSet<Integer> lotto = new TreeSet<Integer>();

		for(int i=0; lotto.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			lotto.add(num);
		}
		System.out.println(lotto);
//=================================================================		
		for (Integer a : lotto) {//int Integer 둘다 되는데 어떤걸 쓰는게 맞는지 궁금합니다~
			System.out.print(a+" ");
		}
	}

}
