package sec05.exam02_field_array;

// 구현 객체를 적용하는 Car
public class Car {
	Tire[] tires = { new HankookTire(), new HankookTire(), new HankookTire(), new HankookTire() };

	void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}
}
