package sec07.exam03_field_polymorphism;

public class Tire {
	// �ʵ�
	public int maxRotation;				// �ִ� ȸ����(Ÿ�̾� ����)
	public int accumulatedRotation;		// ���� ȸ����
	public String location;				// Ÿ�̾� ��ġ
	
	// ������
	public Tire(String location, int maxRotation) {		// �ʵ� �ʱ�ȭ
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// �޼���
	// Ÿ�̾ 1ȸ�� ��Ű�� �޼���� 1�� ������ ������ ���� ȸ������ 1 ������Ų��.
	// ���� ȸ������ �ִ� ȸ�������� ���� ���, ���� ȸ������ ����ϰ� �ִ� ȸ������ �Ǹ� Ÿ�̾ ��ũ��Ų��.
	// ���� ȸ�� �� true, ��ũ �� false
	public boolean roll() {
		++accumulatedRotation;						// ���� ȸ���� 1 ����
		if(accumulatedRotation < maxRotation) {		// ���� < �ִ��� ���
			System.out.println(location + "Tire ���� : " + (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		} else {									// ���� <= �ִ��� ���
			System.out.println("*** " + location + " Tire ��ũ ***");
			return false;
		}
	}
}
