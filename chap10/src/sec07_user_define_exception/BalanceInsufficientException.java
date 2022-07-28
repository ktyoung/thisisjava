package sec07_user_define_exception;

// 컴파일러가 체크하는 일반 예외로 선언하거나 , 컴파일러가 체크하지 않는 실행 예외로 선언할 수 있다.
// 일반 예외로 선언 시 → Exception 상속, 실행 예외로 선언 시 → RuntimeException 상속
public class BalanceInsufficientException extends Exception {
	// 생성자는 2개를 선언하는 것이 일반적이다.
	// 하나는 매개변수가 없는 기본 생성자, 다른 하나는 예외 발생 원인(예외 메시지)를 전달하기 위해 String 타입의 매개변수를 갖는 생성자. 
	public BalanceInsufficientException() {}
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
