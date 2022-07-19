package sec05.exam04_casting;

public class VehicleExample {

	public static void main(String[] args) {
		// 자동 타입 변환
		Vehicle vehicle = new Bus();
		vehicle.run();
		// vehicle.checkFare();		// 부모 클래스에 선언된 메서드가 아니므로 컴파일 에러 → 강제 타입 변환 필요
		
		Bus bus = (Bus) vehicle;	// 강제 형변환
		bus.run();
		bus.checkFare();
	}

}