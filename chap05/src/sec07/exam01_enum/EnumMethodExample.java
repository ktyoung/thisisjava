package sec07.exam01_enum;

public class EnumMethodExample {

	public static void main(String[] args) {
		// name 메서드 : 변수의 내용을 출력
		Week today = Week.SUNDAY; // Enum 객체 today에 SUNDAY 저장
		String name = today.name(); // name 문자열에 today 객체의 내용 저장
		System.out.println(name);
		
		// ordinal 메서드 : 전체 Enum에서 객체의 순서 확인 (0부터 시작함)
		int ordinal = today.ordinal(); // SUNDAY는 Week Enum의 7번째에 위치(0부터 시작하므로 6 출력)
		System.out.println(ordinal);
		
		// compareTo 메서드 : 특정 변수 기준으로 다른 변수의 위치 차이(확인 필요함) 확인
		Week day1 = Week.MONDAY; // day1에 MONDAY 저장
		Week day2 = Week.WEDNESDAY; // day2에 WEDNESDAY 저장
		int result1 = day1.compareTo(day2); // day2 기준으로 day1의 위치 비교 → WEDNESDAY ... MONDAY  
		int result2 = day2.compareTo(day1); // day1 기준으로 day2의 위치 비교 → MONDAY ... WEDNESDAY 
		System.out.println(result1);
		System.out.println(result2);
		
		// valueOf 메서드 : 문자열 비교(.equals와 유사한 메서드)
		Week weekDay = Week.valueOf("SUNDAY");
		if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
			System.out.println("주말이군요.");
		} else {
			System.out.println("평일이군요.");
		}
		
		// argument 방식으로 작동하는 valueOf
		/* if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말이군요.");
			} else {
				System.out.println("평일이군요.");
			}
		} */
		
		// values() 메서드 : Enum의 데이터
		Week[] days = Week.values(); // Week Enum의 데이터를 days 배열에 저장
		for(Week day : days) {
			System.out.println(day);
		}

	}

}
