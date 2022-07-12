package sec13.exam02_constructor_access.package2;

import sec13.exam02_constructor_access.package1.A;

public class D {

	A a1 = new A(true);			// import 후 public 접근 가능
	// A a2 = new A(1);			// A는 다른 패키지에 소속된 클래스이므로 deafult 접근 불가
	// A a3 = new A("문자열")		// private 접근 불가
}
