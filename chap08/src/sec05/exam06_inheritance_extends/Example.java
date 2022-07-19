package sec05.exam06_inheritance_extends;

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
		
		InterfaceC ic = impl;	// interfaceC는 모든 인터페이스를 상속받음
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println();
	}

}
