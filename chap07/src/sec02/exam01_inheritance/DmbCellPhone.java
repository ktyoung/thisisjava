package sec02.exam01_inheritance;

public class DmbCellPhone extends CellPhone {
	// �ʵ�
	int channel;
	
	// ������
	DmbCellPhone(String model, String color, int channel) {
		this.model = model; // �θ� Ŭ�������� ���� �ʵ�
		this.color = color; // �θ� Ŭ�������� ���� �ʵ�
		this.channel = channel;
	}
	
	// �޼���
	void turnOnDmb() {
		System.out.println("ä�� " + channel + "�� DMB ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� " + channel + "������ �ٲߴϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
}
