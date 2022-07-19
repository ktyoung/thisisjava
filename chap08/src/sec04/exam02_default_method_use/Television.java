package sec04.exam02_default_method_use;

// �������̽�(Interface)�� ����(Implements)�ϱ�
// ��ü ������ �Ұ��������� ��üŸ���� �پ��ϰ� ������ �� �����Ƿ� �������� �����ϴµ� �ſ� �߿��� ����
// �߻�Ŭ������ '�̿ϼ� ���赵', �������̽��� '�⺻ ���赵'

public class Television implements RemoteControl{
	private int volume;
	
	// �������̽����� ����� �߻� �޼����� ��ü�� ������ ���־�� ��
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�");		
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
		System.out.println("���� TV ���� : " + volume);	
	}
}
