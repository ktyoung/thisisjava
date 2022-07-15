package sec07.exam05_method_polymorphism;

public class Bus extends Vehicle {
	@Override	// 부모 클래스(Vehicle)의 run() 메서드 재정의
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}
