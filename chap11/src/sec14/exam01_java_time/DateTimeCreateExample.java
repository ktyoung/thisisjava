package sec14.exam01_java_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeCreateExample {

	public static void main(String[] args) throws InterruptedException {
		LocalDate currDate = LocalDate.now();
		System.out.println("���� ��¥ : " + currDate);
		
		LocalDate targetDate = LocalDate.of(2024, 5, 10);
		System.out.println("��ǥ ��¥ : " + targetDate + "\n");
		
		LocalTime currTime = LocalTime.now();
		System.out.println("���� �ð� : " + currTime);
		
		LocalTime targetTime = LocalTime.of(6, 30, 0, 0);
		System.out.println("��ǥ �ð� : " + targetTime + "\n");

		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("���� ��¥�� �ð� : " + currDateTime);
		
		LocalDateTime targetDateTime = LocalDateTime.of(2024, 5, 10, 6, 30, 0, 0);
		System.out.println("��ǥ ��¥�� �ð� : " + targetDateTime + "\n");
	}

}
