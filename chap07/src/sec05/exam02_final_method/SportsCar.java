package sec05.exam02_final_method;

// final 메서드는 오버라이딩 할 수 없다.
// 부모 클래스에 선언된 final 메서드는 자식 클래스에서 재정의 할 수 없다.

public class SportsCar extends Car {
	// 자식 클래스
	
	@Override
	public void speedUp() { speed += 10; } // 오버라이딩 가능
	
	// 오버라이딩 불가, 에러 발생
	/* @Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	} */
}
