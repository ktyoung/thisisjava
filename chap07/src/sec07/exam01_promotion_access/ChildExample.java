package sec07.exam01_promotion_access;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		// 부모 타입으로 자동 타입 변환된 변수는 부모 클래스에 선언된 필드와 메서드에만 접근 가능하다.
		Parents parents = child;	// 자동 타입 변환
		
		parents.method1();			// 부모의 method1 메서드 호출 가능
		parents.method2();			// 재정의 된 자식의 메서드 호출(자식의 method2 호출)
		// parents.method3();			// 호출 불가능

	}

}
