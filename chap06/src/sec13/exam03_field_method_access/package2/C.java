package sec13.exam03_field_method_access.package2;

import sec13.exam03_field_method_access.package1.A;

public class C {
	public C() { // �������� ���� ���� ������ �����ؾ���
		A a = new A(); // import �� ���� ����
		a.field1 = 1;
		// a.field2 = 1;
		// a.field3 = 1;
		
		a.method1();
		// a.method2();
		// a.method3();
	}
}