package sec05.exam02_final_method;

// final �޼���� �������̵� �� �� ����.
// �θ� Ŭ������ ����� final �޼���� �ڽ� Ŭ�������� ������ �� �� ����.

public class SportsCar extends Car {
	// �ڽ� Ŭ����
	
	@Override
	public void speedUp() { speed += 10; } // �������̵� ����
	
	// �������̵� �Ұ�, ���� �߻�
	/* @Override
	public void stop() {
		System.out.println("������ī�� ����");
		speed = 0;
	} */
}
