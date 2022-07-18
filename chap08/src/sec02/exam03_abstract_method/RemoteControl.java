package sec02.exam03_abstract_method;

public interface RemoteControl {	
	// 절대적 : 정말 아무것도 손댈 수 없음
	// 강제적 : 인터페이스를 implements하지 않으면 피할수는 있음
	
	// 인터페이스로 정의한 상수
	// → 인터페이스에서 값을 정해줄테니, 값을 함부로 변경하지 말고 제공해주는 값만 참조하라(절대적)
	int MAX_VALUE = 10;
	int MIN_VALUE = 0;
	
	// 인터페이스로 정의한 추상 메서드 : 실행 블럭이 없음
	// → 가이드를 줄테니 추상메서드를 오버라이딩 하여 재구현하라(강제적)
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
