package new_lecture.p2021_02_10;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 3. Calendar 클래스
		
//		Calendar c1 = new Calendar();				// new연산자 사용시 오류 발생
		Calendar c2 = new GregorianCalendar();		// 업캐스팅
//							Calendar의 자식클래스임.
		Calendar c = Calendar.getInstance();		//일반적방식
//								정적 메소드		
//		System.out.println(c); // 유닉스시간? 으로 출력되서 바로 사용못함.
//		System.out.println(Calendar.YEAR);			// 1
		int y = c.get(Calendar.YEAR);				// 연
		int m = c.get(Calendar.MONTH) + 1;          // 월(0 ~ 11)
		int d = c.get(Calendar.DATE);				// 일
		int w = c.get(Calendar.DAY_OF_WEEK);		// 요일,숫자로 출력됨.
//		1.일, 2.월, 3.화, 4.수, 5.목, 6.금, 7.토
		
		String[] ww = {"일", "월", "화", "수", "목", "금", "토"};
//		ww[w] = ww[w-1]; // 토요일에서 오류남
//		System.out.println(ww[w]+"요일");
		System.out.println(ww[w-1]+"요일");
		
		
		System.out.println(y+"-"+m+"-"+d + "-" + w);
		
		int h1 = c.get(Calendar.HOUR);				// 12시간제 시간
		int h2 = c.get(Calendar.HOUR_OF_DAY);		// 24시간제 시간
		
		int ap = c.get(Calendar.AM_PM);				// 0:오전, 1:오후
		if(ap == 0) {
			System.out.print("오전 ");
		}else {
			System.out.print("오후 ");
		}
		
		int mm = c.get(Calendar.MINUTE);			// 분
		int s = c.get(Calendar.SECOND);				// 초		
		
		System.out.println(h1+":"+mm+":"+s);		// 12시간
		System.out.println(h2+":"+mm+":"+s);		// 24시간		
	}

}
