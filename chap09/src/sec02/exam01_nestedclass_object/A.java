package sec02.exam01_nestedclass_object;

public class A {
	A() { System.out.println("A ��ü�� ������"); }
	
	public class B {
		B() { System.out.println("B ��ü�� ������"); }
		int field1;
		// static int field2;
		void method1() {}
		// static void method2() {}
	}
}