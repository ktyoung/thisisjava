package sec07.exam05_method_polymorphism;

public class Taxi extends Vehicle{
	@Override	// 부모 클래스(Vehicle)의 run() 메서드 재정의
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}
