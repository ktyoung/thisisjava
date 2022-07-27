package sec03_try_catch_finally;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		// try 블록에는 예외 발생 가능성이 있는 코드가 위치한다.
		// try 블록에서 예외가 발생하지 않고 정상적으로 실행되면 catch 블록은 실행되지 않고, finally 블록의 코드를 실행한다.
		// 만약, try 블록에서 예외가 발생하면, 즉시 실행을 멈추고 catch 블록으로 이동하여 예외 처리 코드를 실행한다.
		// 이후 finally 블록의 코드를 실행한다.
		
		try {
			Class clazz = Class.forName("java.lang.String2");	// Class.forName() 메서드는 매개값으로 주어진 클래스가 존재하면 Class 객체를 리턴
																// 존재하지 않으면 ClassNotFoundException 예외를 발생시킨다.

		} catch(ClassNotFoundException e) {						// forName()의 매개값으로 주어진 java.lang.String2 클래스는 존재하지 않아서
																// 예외가 발생하게 됨.
																// 따라서 catch 블록을 수행하여 예외 처리를 하게 된다.
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
}
