package sec07.exam02_promotion_access;

public class Child extends Parents {
	@Override 
	public void method2() { // �θ��� method2 ������
		System.out.println("Child - method2();");
	}
	
	public void method3() {
		System.out.println("Child - method3();");
	}
}
