package sec05.exam02_field_array;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run(); // 4���� ��ġ Ÿ�̾� ��� �ѱ�Ÿ�̾�
		System.out.println();
		
		// ���� Ÿ�̾� ��ȣ Ÿ�̾�� ��ü
		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();
		
		myCar.run();
	}

}
