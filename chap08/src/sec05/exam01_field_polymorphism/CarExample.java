package sec05.exam01_field_polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run(); // 4���� ��ġ Ÿ�̾� ��� �ѱ�Ÿ�̾�
		System.out.println();
		
		// ���� Ÿ�̾� ��ȣ Ÿ�̾�� ��ü
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();
	}

}
