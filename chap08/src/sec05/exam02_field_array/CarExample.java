package sec05.exam02_field_array;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run(); // 4가지 위치 타이어 모두 한국타이어
		System.out.println();
		
		// 앞쪽 타이어 금호 타이어로 교체
		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();
		
		myCar.run();
	}

}
