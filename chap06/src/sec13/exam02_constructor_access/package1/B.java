package sec13.exam02_constructor_access.package1;

public class B {
	A a1 = new A(true);			// public 접근 가능
	A a2 = new A(1);			// default 접근 가능
	// A a3 = new A("문자열");	// private 생성자 접근 불가 → 같은 클래스에 있어야 함
}
