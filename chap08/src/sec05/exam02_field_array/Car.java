package sec05.exam02_field_array;

// ���� ��ü�� �����ϴ� Car
public class Car {
	Tire[] tires = { new HankookTire(), new HankookTire(), new HankookTire(), new HankookTire() };

	void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}
}
