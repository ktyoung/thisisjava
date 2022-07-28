package sec06_throws;

public class ThrowsExample {

	// main() 메서드에서도 throws 키워드를 사용해서 예외를 떠넘길 수 있지만, main() 메서드에 throws Exception을 붙이는 것은 바람직하지 않다.
	public static void main(String[] args) {
		// throws 키워드가 붙어있는 메서드는 반드시 try 블록 내에서 호출되어야 한다.
		// 그리고 catch 블록에서 떠넘겨 받은 예외를 처리해야 한다.
		try  {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}

	}

	// throws : 메서드 선언부 끝에 작성, 메서드에서 처리하지 않은 예외를 호출한 곳으로 떠넘기는 역할
	// 발생할 수 있는 예외를 종류별로 throws 뒤에 나열하는 것이 일반적이지만, Exception(상위 클래스)만으로 모든 예외를 간단히 떠넘길 수 있다.
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}
}
