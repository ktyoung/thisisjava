package sec15.exam01_annotation;

public class Service {
	
	@PrintAnnotation()
	public void method1() {
		System.out.println("실행 내용1");
	}
	
	@PrintAnnotation(value="*") // String value 엘리먼트
	public void method2() {
		System.out.println("실행 내용2");
	}
	
	@PrintAnnotation(value="#", number=20) // String value 엘리먼트, int number 엘리먼트
	public void method3() {
		System.out.println("실행 내용3");
	}
}
