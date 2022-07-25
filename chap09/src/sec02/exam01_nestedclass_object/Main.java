package sec02.exam01_nestedclass_object;

public class Main {

	public static void main(String[] args) {
		A a = new A();		// 인스턴스 멤버 클래스 객체 생성을 해주어야 클래스 사용 가능
		A.B b = a.new B(); 
		b.field1 = 3;
		b.method1();
		
		A.C c = new A.C();
		c.field1 = 3;		// 스태틱 멤버 클래스 객체 생성을 하지 않아도 클래스 사용 가능
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		// A.D d = new A.D();
		a.method();			// 로컬 클래스 객체 생성을 위한 메서드 호출
	}


}
