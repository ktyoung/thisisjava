package sec04.exam02_default_method_use;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null;	// �������̽� Ÿ���� ���� rc ����
		
		rc = new Television();		// rc�� Televison Ŭ������ �����ϸ� Televison�� ������ �޼��尡 ����
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		
		rc = new Audio();			// rc�� Audio Ŭ������ �����ϸ� Audio ������ �޼��尡 ����
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
	}

}
