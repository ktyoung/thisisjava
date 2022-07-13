package sec15.exam01_annotation;

public class Service {
	
	@PrintAnnotation()
	public void method1() {
		System.out.println("���� ����1");
	}
	
	@PrintAnnotation(value="*") // String value ������Ʈ
	public void method2() {
		System.out.println("���� ����2");
	}
	
	@PrintAnnotation(value="#", number=20) // String value ������Ʈ, int number ������Ʈ
	public void method3() {
		System.out.println("���� ����3");
	}
}
