package sec14.exam01_java_time;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTimeInfoExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		String strDateTime = now.getYear() + "�� ";
		strDateTime += now.getMonthValue() + "�� ";
		strDateTime += now.getDayOfMonth() + "�� ";
		strDateTime += now.getDayOfWeek() + " ";
		strDateTime += now.getHour() + "�� ";
		strDateTime += now.getMinute() + "�� ";
		strDateTime += now.getSecond() + "�� ";
		strDateTime += now.getNano() + "������ ";
		System.out.println(strDateTime + "\n");
		
		LocalDate nowDate = now.toLocalDate();
		if(nowDate.isLeapYear()) {
			System.out.println("���ش� ���� : 2���� 29�ϱ��� �ֽ��ϴ�.\n");
		} else {
			System.out.println("���ش� ��� : 2���� 28�ϱ��� �ֽ��ϴ�.\n");
		}

	}

}
