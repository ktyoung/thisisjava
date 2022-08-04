package sec14.exam01_java_time;

import java.time.LocalDateTime;

public class DateTimeOperationExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재시 : " + now);
		
		LocalDateTime targetDateTime = now
				.plusYears(1)		// 1년 더하기
				.minusMonths(2)		// 2달 빼기
				.plusDays(3)		// 3일 더하기
				.plusHours(4)		// 4시간 더하기
				.minusMinutes(5)	// 5분 빼기
				.plusSeconds(6);	// 6초 더하기
		System.out.println("연산후 : " + targetDateTime);
	}

}
