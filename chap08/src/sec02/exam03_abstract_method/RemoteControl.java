package sec02.exam03_abstract_method;

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
}
