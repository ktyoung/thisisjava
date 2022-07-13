package sec02.exam01_inheritance;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// DmbCellPhone ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		
		// �θ� Ŭ����(CellPhone)�κ��� ��ӹ��� �ʵ�
		System.out.println("�� : " + dmbCellPhone.model);
		System.out.println("���� : " + dmbCellPhone.color);
		
		// �ڽ� Ŭ����(DmbCellPhone)�� �ʵ�
		System.out.println("ä�� : " + dmbCellPhone.channel);
		System.out.println();
		
		// �θ� Ŭ������(CellPhone)���� ��ӹ��� �޼��� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���");
		dmbCellPhone.sendVoice("�ݰ����ϴ�");
		dmbCellPhone.hangup();
		System.out.println();
		
		// �ڽ� Ŭ����(DmbCellPhone)�� �޼��� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();

	}

}
