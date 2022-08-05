package test01;

public class NestedClassExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		Car.Tire tire = myCar.new Tire();		// 객체 생성을 통해서만 접근이 가능함
		Car.Engine engine = new Car.Engine();	// 객체 생성 없이 접근이 가능함
	}

}
