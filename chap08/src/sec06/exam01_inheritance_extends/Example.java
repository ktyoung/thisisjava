package sec06.exam01_inheritance_extends;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		// ia.methodB();
		// ia.methodC();
		System.out.println();
		
		InterfaceB ib = impl;
		// ib.methodA();
		ib.methodB();
		// ib.methodC();
		System.out.println();
		
		InterfaceC ic = impl;	// interfaceC�� ��� �������̽��� ��ӹ���
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println();
	}

}
