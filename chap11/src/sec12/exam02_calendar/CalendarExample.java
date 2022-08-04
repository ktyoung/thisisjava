package sec12.exam02_calendar;

import java.util.Calendar;

// 달력을 표현한 Calendar 클래스. 추상 클래스이므로 new 연산자를 사용해서 인스턴스를 생성할 수 없다.
// (날짜, 시간 계산이 지역, 나라마다 다르기 때문이다.)
public class CalendarExample {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();		// Calendar 클래스의 정적 메서드 getInstance() 메서드를 이용하면,
													// 현재 운영체제에 설정된 시간대를 기준으로 한 Calendar 하위 객체를 얻을 수 있다.
		
		// Calendar 객체를 얻었다면 get() 메서드를 통해 날짜와 시간에 대한 정보를 읽을 수 있다.
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);

		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
			case Calendar.MONDAY:
				strWeek = "월"; 
				break;
			case Calendar.TUESDAY:
				strWeek = "화"; 
				break;
			case Calendar.WEDNESDAY:
				strWeek = "수"; 
				break;
			case Calendar.THURSDAY:
				strWeek = "목"; 
				break;
			case Calendar.FRIDAY:
				strWeek = "금"; 
				break;
			case Calendar.SATURDAY:
				strWeek = "토"; 
				break;
			default:
				strWeek = "일";
			}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
	}

}
