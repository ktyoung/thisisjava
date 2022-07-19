package sec04.exam02_default_method_use;

public interface RemoteControl {
	// 절대적 : 정말 아무것도 손댈 수 없음
	// 강제적 : 인터페이스를 implements하여 오버라이딩
	
	// 인터페이스로 정의한 상수
	// → 인터페이스에서 값을 정해줄테니, 값을 함부로 변경하지 말고 제공해주는 값만 참조하라(절대적)
	int MAX_VALUE = 10;
	int MIN_VALUE = 0;
	
	// 인터페이스로 정의한 추상 메서드 : 실행 블럭이 없음
	// → 가이드를 줄테니 추상메서드를 오버라이딩 하여 재구현하라(강제적)
	void turnOn();
	void turnOff();
	void setVolume(int volume);	

	// 인터페이스로 정의한 디폴트 메서드
	// → 인터페이스에서 기본적으로 제공해주지만, 맘에 안 들면 각자 구현해서 사용하라(선택적)
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	// 인터페이스로 정의한 정적 메서드
	// → 인터페이스에서 제공해주는 것으로 무조건 사용(절대적)
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}