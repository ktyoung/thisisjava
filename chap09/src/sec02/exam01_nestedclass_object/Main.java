package sec02.exam01_nestedclass_object;

public class Main {

	public static void main(String[] args) {
		A a = new A();		// 인스턴스 멤버 클래스 객체 생성을 해주어야 함
		A.B b = a.new B(); 
		b.field1 = 3;
		b.method1();

	}

	static class C {
		C() { System.out.println("C 객체가 생성됨"); }
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
}
