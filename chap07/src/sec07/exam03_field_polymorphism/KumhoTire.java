package sec07.exam03_field_polymorphism;

public class KumhoTire extends Tire {
	// 필드
	
	// 생성자
	// 타이어의 위치, 최대 회전 수를 매개변수로 받아 부모 클래스인 Tire 클래스의 생성자 호출 시 넘겨준다.
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// 메서드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "KumhoTire 수명 : " + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " KumhoTire 펑크 ***");
			return false;
		}
	}
}
