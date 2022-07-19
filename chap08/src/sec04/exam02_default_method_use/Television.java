package sec04.exam02_default_method_use;

// 인터페이스(Interface)를 구현(Implements)하기
// 객체 생성이 불가능하지만 객체타입을 다양하게 변경할 수 있으므로 다형성을 구현하는데 매우 중요한 역할
// 추상클래스는 '미완성 설계도', 인터페이스는 '기본 설계도'

public class Television implements RemoteControl{
	private int volume;
	
	// 인터페이스에서 선언된 추상 메서드의 실체를 재정의 해주어야 함
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VALUE) {
			this.volume = RemoteControl.MAX_VALUE;
		} else if(volume<RemoteControl.MIN_VALUE) {
			this.volume = RemoteControl.MIN_VALUE;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + volume);	
	}
}
