package sec03.exam02_noname_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		// 익명 구현 개체 → 일회성이며, 재사용할 필요가 없고 파일단위의 관리 대상이 아닌 객체를 만들 때 활용
		// 인터페이스는 객체를 생성할 수 없음
		RemoteControl rc = new RemoteControl() {
			public void turnOn() { /* 실행문 */ }
			public void turnOff() { /* 실행문 */ }
			public void setVolume(int volume) { /* 실행문 */ }
		};

	}

}
