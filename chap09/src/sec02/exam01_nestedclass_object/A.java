package sec02.exam01_nestedclass_object;

public class A {
	A() { System.out.println("A 按眉啊 积己凳"); }
	
	public class B {
		B() { System.out.println("B 按眉啊 积己凳"); }
		int field1;
		// static int field2;
		void method1() {}
		// static void method2() {}
	}
}