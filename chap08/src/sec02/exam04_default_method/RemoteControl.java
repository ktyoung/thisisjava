package sec02.exam04_default_method;

public interface RemoteControl {
	// ������ : ���� �ƹ��͵� �մ� �� ����
	// ������ : �������̽��� implements���� ������ ���Ҽ��� ����
	
	// �������̽��� ������ ���
	// �� �������̽����� ���� �������״�, ���� �Ժη� �������� ���� �������ִ� ���� �����϶�(������)
	int MAX_VALUE = 10;
	int MIN_VALUE = 0;
	
	// �������̽��� ������ �߻� �޼��� : ���� ���� ����
	// �� ���̵带 ���״� �߻�޼��带 �������̵� �Ͽ� �籸���϶�(������)
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// �������̽��� ������ ����Ʈ �޼���
	// �� �������̽����� �⺻������ ������������, ���� �� ��� ���� �����ؼ� ����϶�(������)
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� �����մϴ�.");
		}
	}
}
