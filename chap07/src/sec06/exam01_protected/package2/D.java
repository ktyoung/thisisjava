package sec06.exam01_protected.package2;

import sec06.exam01_protected.package1.A;	// import A

// protected ���� �����ڴ� �ٸ� ��Ű���� ���, �ڽ� Ŭ������ ������ ����Ѵ�.
// A Ŭ������ �ٸ� ��Ű��, ������ A�� �ڽ� Ŭ�����̹Ƿ� A�� �ʵ�, ������, �޼��� ���� ����

public class D extends A {
	public D() {
		super();				// �θ� ������ ���� ����
		this.field = "value";	// �θ� �ʵ� ���� ����
		this.method();			// �θ� �޼��� ���� ����
	}
}