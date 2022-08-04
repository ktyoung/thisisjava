package sec14.exam01_java_time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCreateExample {

	public static void main(String[] args) throws InterruptedException {
		LocalDate currDate = LocalDate.now();
		System.out.println("현재 날짜 : " + currDate);
		
		LocalDate targetDate = LocalDate.of(2024, 5, 10);
		System.out.println("목표 날짜 : " + targetDate + "\n");
		
		LocalTime currTime = LocalTime.now();
		System.out.println("현재 시간 : " + currTime);
		
		LocalTime targetTime = LocalTime.of(6, 30, 0, 0);
		System.out.println("목표 시간 : " + targetTime + "\n");

		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("현재 날짜와 시간 : " + currDateTime);
		
		LocalDateTime targetDateTime = LocalDateTime.of(2024, 5, 10, 6, 30, 0, 0);
		System.out.println("목표 날짜와 시간 : " + targetDateTime + "\n");
		
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정 세계시 : " + utcDateTime);
		ZonedDateTime newyorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("뉴욕 시간존 : " + newyorkDateTime + "\n");
		
		// Instant : 날짜, 시간 정보를 얻거나 조작하는데 사용하지 않고, 특정 시점의 타임 스탬프로 사용된다.
		// 주로 특정한 두 시점 간의 우선순위를 따질 때 사용한다.
		Instant instant1 = Instant.now();
		// System.out.println(instant1);
		Thread.sleep(1000);	// 실행중인 스레드를 1000ms 동안 일시정지
		Instant instant2 = Instant.now();
		// System.out.println(instant2);
		if(instant1.isBefore(instant2)) {
			System.out.println("instant1이 빠릅니다.");
		} else if(instant1.isAfter(instant2)) {
			System.out.println("instant1이 늦습니다.");
		} else {
			System.out.println("동일한 시간입니다.");
		}
		// until() 메서드는 두 시점간의 차이를 리턴
		System.out.println("차이(nanos) : " + instant1.until(instant2, ChronoUnit.NANOS));
	}

}
