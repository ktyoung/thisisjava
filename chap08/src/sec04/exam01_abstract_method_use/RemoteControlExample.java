package sec04.exam01_abstract_method_use;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null;	// �������̽� Ÿ���� ���� rc ����
		
		rc = new Television();		// rc�� Televison Ŭ������ �����ϸ� Televison�� ������ �޼��尡 ����
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(10);
		rc.setMute(true);
		rc.setMute(false);
		
		rc = new Audio();			// rc�� Audio Ŭ������ �����ϸ� Audio ������ �޼��尡 ����
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
	}

}
