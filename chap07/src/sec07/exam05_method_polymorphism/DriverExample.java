package sec07.exam05_method_polymorphism;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);		// bus는 클래스형 변수이므로 실행이 가능함
		driver.drive(taxi);

	}

}
