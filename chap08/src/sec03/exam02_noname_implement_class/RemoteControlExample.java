package sec03.exam02_noname_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		// �͸� ���� ��ü �� ��ȸ���̸�, ������ �ʿ䰡 ���� ���ϴ����� ���� ����� �ƴ� ��ü�� ���� �� Ȱ��
		// �������̽��� ��ü�� ������ �� ����
		RemoteControl rc = new RemoteControl() {
			public void turnOn() { /* ���๮ */ }
			public void turnOff() { /* ���๮ */ }
			public void setVolume(int volume) { /* ���๮ */ }
		};

	}

}
