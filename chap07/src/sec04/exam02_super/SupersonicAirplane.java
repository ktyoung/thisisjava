package sec04.exam02_super;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;				// 상수 선언
	public static final int SUPERSONIC = 2;			// 상수 선언
	
	public int flyMode = NORMAL;
	
	// 자식 클래스에 부모 클래스의 메서드를 오버라이딩하면, 부모 클래스는 숨겨지고 오버라이딩 된 자식 메서드만 사용된다.
	
	@Override // 추가로 덧붙여짐
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");	// flyMode()가 SUPERSONIC 상수값을 가질 경우 "초음속비행합니다" 출력
			
		} else {
			// Airplane 객체의 fly() 메서드 호출
			// fly() 메서드는 오버라이딩 됨
			super.fly();							// ... 그렇지 않을 경우, 부모 클래스 Airplane의 fly() 메서드를 호출하기 위해 super.fly() 사용
		}
	}
}
