package sec02.exam01_nestedclass_object;

public class Main {

	public static void main(String[] args) {
		A a = new A();		// �ν��Ͻ� ��� Ŭ���� ��ü ������ ���־�� Ŭ���� ��� ����
		A.B b = a.new B(); 
		b.field1 = 3;
		b.method1();
		
		A.C c = new A.C();
		c.field1 = 3;		// ����ƽ ��� Ŭ���� ��ü ������ ���� �ʾƵ� Ŭ���� ��� ����
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		// A.D d = new A.D();
		a.method();			// ���� Ŭ���� ��ü ������ ���� �޼��� ȣ��
	}


}
