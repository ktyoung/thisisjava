package sec02.exam01_nestedclass_object;

public class Main {

	public static void main(String[] args) {
		A a = new A();		// �ν��Ͻ� ��� Ŭ���� ��ü ������ ���־�� ��
		A.B b = a.new B(); 
		b.field1 = 3;
		b.method1();

	}

	static class C {
		C() { System.out.println("C ��ü�� ������"); }
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
}
