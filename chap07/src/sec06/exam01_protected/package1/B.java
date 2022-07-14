package sec06.exam01_protected.package1;

// A 클래스와 동일한 패키지에 있으므로 A 클래스의 필드, 생성자, 메서드에 접근 가능

public class B {
	// 메서드
	public void method() {
		A a = new A();		// 생성자 접근 가능
		a.field = "value";	// 필드 접근 가능
		a.method();			// 메서드 접근 가능
	}
}
