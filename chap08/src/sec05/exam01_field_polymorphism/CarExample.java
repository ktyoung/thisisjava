package sec05.exam01_field_polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run(); // 4가지 위치 타이어 모두 한국타이어
		System.out.println();
		
		// 앞쪽 타이어 금호 타이어로 교체
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();
	}

}
