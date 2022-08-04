package sec12.exam02_calendar;

import java.util.Calendar;

// �޷��� ǥ���� Calendar Ŭ����. �߻� Ŭ�����̹Ƿ� new �����ڸ� ����ؼ� �ν��Ͻ��� ������ �� ����.
// (��¥, �ð� ����� ����, ���󸶴� �ٸ��� �����̴�.)
public class CalendarExample {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();		// Calendar Ŭ������ ���� �޼��� getInstance() �޼��带 �̿��ϸ�,
													// ���� �ü���� ������ �ð��븦 �������� �� Calendar ���� ��ü�� ���� �� �ִ�.
		
		// Calendar ��ü�� ����ٸ� get() �޼��带 ���� ��¥�� �ð��� ���� ������ ���� �� �ִ�.
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);

		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
			case Calendar.MONDAY:
				strWeek = "��"; 
				break;
			case Calendar.TUESDAY:
				strWeek = "ȭ"; 
				break;
			case Calendar.WEDNESDAY:
				strWeek = "��"; 
				break;
			case Calendar.THURSDAY:
				strWeek = "��"; 
				break;
			case Calendar.FRIDAY:
				strWeek = "��"; 
				break;
			case Calendar.SATURDAY:
				strWeek = "��"; 
				break;
			default:
				strWeek = "��";
			}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "����";
		} else {
			strAmPm = "����";
		}
	}

}
