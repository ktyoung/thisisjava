package sec04.exam02_super;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;				// ��� ����
	public static final int SUPERSONIC = 2;			// ��� ����
	
	public int flyMode = NORMAL;
	
	// �ڽ� Ŭ������ �θ� Ŭ������ �޼��带 �������̵��ϸ�, �θ� Ŭ������ �������� �������̵� �� �ڽ� �޼��常 ���ȴ�.
	
	@Override // �߰��� ���ٿ���
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("�����Ӻ����մϴ�.");	// flyMode()�� SUPERSONIC ������� ���� ��� "�����Ӻ����մϴ�" ���
			
		} else {
			// Airplane ��ü�� fly() �޼��� ȣ��
			// fly() �޼���� �������̵� ��
			super.fly();							// ... �׷��� ���� ���, �θ� Ŭ���� Airplane�� fly() �޼��带 ȣ���ϱ� ���� super.fly() ���
		}
	}
}
