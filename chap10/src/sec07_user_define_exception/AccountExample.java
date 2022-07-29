package sec07_user_define_exception;

public class AccountExample {

	// 모든 예외 객체는 Exception 클래스를 상속하기 때문에, Exception이 가지고 있는 메서드들은 모든 예외 객체에서 호출할 수 있다.
	// 자주 사용하는 메서드 1: getMessage();, 2: printStackTrace();
	public static void main(String[] args) {
		Account account = new Account();
		
		// 예금하기
		account.deposit(10000);
		System.out.println("예금액 : " + account.getBalance());
		
		// 출금하기
		try {
			account.withdraw(30000);
		} catch(BalanceInsufficientException e) {	// 예외 메시지 얻기
			String message = e.getMessage();		// 예외 메시지는 catch 블록에서 getMessage() 메서드의 리턴 값으로 얻을 수 있다.
			System.out.println(message);
			System.out.println();
			e.printStackTrace();					// 예외 추적 후 출력
		}

	}

}