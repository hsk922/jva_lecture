package new_lecture.p2021_02_10;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// 날짜 시간 관련 클래스 : Date, Timestamp
// 1. Date
		//hh소문자는 12시간제, a는 오전 오후 표시.
//		SimpleDateFormat sd = new SimpleDateFormat
//		("yyyy년 MM월 dd일  a hh:mm:ss EEE요일");
		SimpleDateFormat sd = 
				new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss EEE요일");
//		hh: 12시간제 시간
//		HH: 24시간제 시간		
		
		Date d = new Date();
		System.out.println(d);
		System.out.println(sd.format(d));		
		
		
// 2. Timestamp	
		
		// 년, 월, 일, 시, 분 으로 날짜 출력		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		
		
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		//					long형				long형 (정적메소드)
		System.out.println(ts);//보통 1000분의 1초까지 필요없음
		System.out.println(sf.format(ts));//위에서 필요한 부분만 나오게 만들어서 출력.
		
	}

}
