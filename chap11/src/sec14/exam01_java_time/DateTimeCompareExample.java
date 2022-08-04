package sec14.exam01_java_time;

import java.time.LocalDateTime;

public class DateTimeCompareExample {

	public static void main(String[] args) {
		LocalDateTime startDateTime = LocalDateTime.of(2023, 1, 1, 9, 0, 0);
		System.out.println("시작일 : " + startDateTime);
		
		LocalDateTime endDateTime = LocalDateTime.of(2024, 3, 31, 18, 0, 0);
		System.out.println("시작일 : " + endDateTime + "\n");
		
		if(startDateTime.isBefore(endDateTime)) {
			System.out.println("진행 중입니다." + "\n");
		} else if(startDateTime.isEqual(endDateTime)) {
			System.out.println("종료합니다." + "\n");
		} else if(startDateTime.isAfter(endDateTime)) {
			System.out.println("종료했습니다." + "\n");
		}

	}

}
