package sec07.exam05_method_polymorphism;

public class Bus extends Vehicle {
	@Override	// �θ� Ŭ����(Vehicle)�� run() �޼��� ������
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}
}
