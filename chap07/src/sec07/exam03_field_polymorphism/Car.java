package sec07.exam03_field_polymorphism;

public class Car {
	// �ʵ�
	Tire frontLeftTire = new Tire("�տ���", 6);		// ��ġ �̸��� �ִ� ȸ������ ��ü ���� �� �ʱ�ȭ �� �ִ� ȸ���� 6�� �־�, 6ȸ�� �� Ÿ�̾� ��ũ!
	Tire frontRightTire = new Tire("�տ�����", 2);
	Tire backLeftTire = new Tire("�ڿ���", 3);
	Tire backRightTire = new Tire("�ڿ�����", 4);
	
	// ������
	
	// �޼���
	int run() {		// 4���� Ÿ�̾ 1ȸ�� ��Ű�� �޼���
					// Tire ��ü�� roll() �޼��带 ȣ���ؼ� ���ϰ��� false(��ũ)�̸� stop() �޼��带 ȣ���ϰ� �ش� Ÿ�̾� ��ȣ(��ġ)�� ����
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		
		// ��� Ÿ�̾� 1ȸ��, ���� roll() �޼��� ȣ��, ��ũ �� stop() ȣ���ϰ� ��ġ ����
		if(frontLeftTire.roll() == false) { stop(); return 1; };
		if(frontRightTire.roll() == false) { stop(); return 2; };
		if(backLeftTire.roll() == false) { stop(); return 3; };
		if(backRightTire.roll() == false) { stop(); return 4; };
		
		return 0;
	}
	
	void stop() {	// Ÿ�̾ ��ũ���� �� �ڵ����� ���ߴ� �޼���
		System.out.println("[�ڵ����� ����ϴ�.]");
	}
}
