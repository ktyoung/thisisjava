package sec12.exam01_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();	// 현재 날짜를 문자열로 얻고 싶으면 toString() 메서드 사용
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow2 = sdf.format(now);	// 특정 문자열 포멧으로 얻고 싶다면 SimpleDataFormat 클래스 사용
		System.out.println(strNow2);

	}

}
