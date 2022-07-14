package sec06.exam01_protected.package2;

import sec06.exam01_protected.package1.A;	// import A

// protected 접근 제한자는 다른 패키지의 경우, 자식 클래스만 접근을 허용한다.
// A 클래스와 다른 패키지, 하지만 A의 자식 클래스이므로 A의 필드, 생성자, 메서드 접근 가능

public class D extends A {
	public D() {
		super();				// 부모 생성자 접근 가능
		this.field = "value";	// 부모 필드 접근 가능
		this.method();			// 부모 메서드 접근 가능
	}
}