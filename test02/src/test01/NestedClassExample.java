package test01;

public class NestedClassExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		Car.Tire tire = myCar.new Tire();		// ��ü ������ ���ؼ��� ������ ������
		Car.Engine engine = new Car.Engine();	// ��ü ���� ���� ������ ������
	}

}
