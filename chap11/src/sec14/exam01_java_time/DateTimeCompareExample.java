package sec14.exam01_java_time;

import java.time.LocalDateTime;

public class DateTimeCompareExample {

	public static void main(String[] args) {
		LocalDateTime startDateTime = LocalDateTime.of(2023, 1, 1, 9, 0, 0);
		System.out.println("������ : " + startDateTime);
		
		LocalDateTime endDateTime = LocalDateTime.of(2024, 3, 31, 18, 0, 0);
		System.out.println("������ : " + endDateTime + "\n");
		
		if(startDateTime.isBefore(endDateTime)) {
			System.out.println("���� ���Դϴ�." + "\n");
		} else if(startDateTime.isEqual(endDateTime)) {
			System.out.println("�����մϴ�." + "\n");
		} else if(startDateTime.isAfter(endDateTime)) {
			System.out.println("�����߽��ϴ�." + "\n");
		}

	}

}
