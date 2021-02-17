package new_lecture.p2021_02_15;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("확인 할 연도를 입력하세요.");
		int a = sc.nextInt();

		if (gc.isLeapYear(a)) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("평년입니다.");
		}

	}

}
