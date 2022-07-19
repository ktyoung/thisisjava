package sec04.exam01_abstract_method_use;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null;	// 인터페이스 타입의 변수 rc 선언
		
		rc = new Television();		// rc에 Televison 클래스를 생성하면 Televison에 구현된 메서드가 동작
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(10);
		rc.setMute(true);
		rc.setMute(false);
		
		rc = new Audio();			// rc에 Audio 클래스를 생성하면 Audio 구현된 메서드가 동작
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
	}

}
