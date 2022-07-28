package sec07_user_define_exception;

public class Account {
	private long balance;
	public Account() {}
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	// 예외 객체를 생성 시 기본 생성자 또는 예외 메시지를 갖는 생성자 중 어떤 것을 사용해도 된다.
	// 만약 catch 블록에서 예외 메시지가 필요하다면, 예외 메시지를 갖는 생성자를 이용해야 한다.
	// 예외 발생 코드를 가지고 있는 메서드는 내부에서 try-catch 블록으로 예외처리를 할 수 있지만 대부분은 자신을 호출한 곳에서 예외를 처리하도록 throws 키워드로 예외를 넘김
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			throw new BalanceInsufficientException("잔고 부족! : " + (money - balance) + "모자람"); 
		}
		balance -= money;
	}
}
