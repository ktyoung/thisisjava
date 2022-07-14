package sec07.exam03_field_polymorphism;

public class Car {
	// 필드
	Tire frontLeftTire = new Tire("앞왼쪽", 6);		// 위치 이름과 최대 회전수로 객체 생성 및 초기화 → 최대 회전수 6을 주어, 6회전 시 타이어 펑크!
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	// 생성자
	
	// 메서드
	int run() {		// 4개의 타이어를 1회전 시키는 메서드
					// Tire 객체의 roll() 메서드를 호출해서 리턴값이 false(펑크)이면 stop() 메서드를 호출하고 해당 타이어 번호(위치)를 리턴
		System.out.println("[자동차가 달립니다.]");
		
		// 모든 타이어 1회전, 각각 roll() 메서드 호출, 펑크 시 stop() 호출하고 위치 리턴
		if(frontLeftTire.roll() == false) { stop(); return 1; };
		if(frontRightTire.roll() == false) { stop(); return 2; };
		if(backLeftTire.roll() == false) { stop(); return 3; };
		if(backRightTire.roll() == false) { stop(); return 4; };
		
		return 0;
	}
	
	void stop() {	// 타이어가 펑크났을 때 자동차를 멈추는 메서드
		System.out.println("[자동차가 멈춥니다.]");
	}
}
