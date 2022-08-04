package sec14.exam01_java_time;

import java.time.LocalDateTime;

public class DateTimeOperationExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("����� : " + now);
		
		LocalDateTime targetDateTime = now
				.plusYears(1)		// 1�� ���ϱ�
				.minusMonths(2)		// 2�� ����
				.plusDays(3)		// 3�� ���ϱ�
				.plusHours(4)		// 4�ð� ���ϱ�
				.minusMinutes(5)	// 5�� ����
				.plusSeconds(6);	// 6�� ���ϱ�
		System.out.println("������ : " + targetDateTime);
	}

}
