package sec05.exam04_casting;

public class VehicleExample {

	public static void main(String[] args) {
		// �ڵ� Ÿ�� ��ȯ
		Vehicle vehicle = new Bus();
		vehicle.run();
		// vehicle.checkFare();		// �θ� Ŭ������ ����� �޼��尡 �ƴϹǷ� ������ ���� �� ���� Ÿ�� ��ȯ �ʿ�
		
		Bus bus = (Bus) vehicle;	// ���� ����ȯ
		bus.run();
		bus.checkFare();
	}

}