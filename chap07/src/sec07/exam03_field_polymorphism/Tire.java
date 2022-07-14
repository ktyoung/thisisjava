package sec07.exam03_field_polymorphism;

public class Tire {
	// 필드
	public int maxRotation;				// 최대 회전수(타이어 수명)
	public int accumulatedRotation;		// 누적 회전수
	public String location;				// 타이어 위치
	
	// 생성자
	public Tire(String location, int maxRotation) {		// 필드 초기화
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// 메서드
	// 타이어를 1회전 시키는 메서드로 1번 실행할 때마다 누적 회전수를 1 증가시킨다.
	// 누적 회전수가 최대 회전수보다 작을 경우, 남은 회전수를 출력하고 최대 회전수가 되면 타이어를 펑크시킨다.
	// 정상 회전 시 true, 펑크 시 false
	public boolean roll() {
		++accumulatedRotation;						// 누적 회전수 1 증가
		if(accumulatedRotation < maxRotation) {		// 누적 < 최대일 경우
			System.out.println(location + "Tire 수명 : " + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {									// 누적 <= 최대일 경우
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}
