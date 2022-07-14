package sec06.exam01_protected.package2;

import sec06.exam01_protected.package1.A; // import A

// A 클래스와 다른 패키지에 있으므로 A 클래스의 필드, 생성자, 메서드에 접근이 불가능

public class C {
	public void method() {
		/*		
 		A a = new A();		// 생성자 접근 불가
		a.field = "value";	// 필드 접근 불가
		a.method();			// 메서드 접근 불가
		*/	
	}
}
