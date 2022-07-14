package sec07.exam02_promotion_access;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		// 부모 타입으로 자동 타입 변환된 변수는 부모 클래스에 선언된 필드와 메서드에만 접근 가능하다.
		
		Parents parents = child;	// 자동 타입 변환
									// Parents 타입  parents 변수는 Child 객체를 참조할 수 있다.
									// Child 객체는 Paretns 객체를 상속 받았기 때문이다.
		
		parents.method1();			// 부모의 method1 메서드 호출 가능
		
		parents.method2();			// 재정의 된 자식의 메서드 호출(자식의 method2 호출)
									// 메서드가 자식의 클래스에서 오버라이딩 되었다면, 자식 클래스의 메서드(재정의 된 메서드)가 대신 호출된다. (다형성과 관련)
									// 오버라이딩 되었다면, 자식 클래스의 메서드에 접근 가능하다.
		
		// parents.method3();		// 호출 불가능

	}

}
