package sec07.exam08_abstract_class;

// ��빮�� : 	Ŭ���� �տ� abstract�� ���̸� �߻� Ŭ����

public abstract class Phone {
	// �ʵ�
	public String owner;
	
	// ������
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// �޼���
	public void turnOn() {
		System.out.println("�� ������ �մϴ�");
	}
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�");
	}
}
