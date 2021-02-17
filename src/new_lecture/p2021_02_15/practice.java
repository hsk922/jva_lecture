package new_lecture.p2021_02_15;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("확인할 연도를 입력하세요.");
		int a = sc.nextInt();

		if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("평년입니다.");
		}

	}

}
