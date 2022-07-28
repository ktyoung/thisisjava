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
	
	// ���� ��ü�� ���� �� �⺻ ������ �Ǵ� ���� �޽����� ���� ������ �� � ���� ����ص� �ȴ�.
	// ���� catch ��Ͽ��� ���� �޽����� �ʿ��ϴٸ�, ���� �޽����� ���� �����ڸ� �̿��ؾ� �Ѵ�.
	// ���� �߻� �ڵ带 ������ �ִ� �޼���� ���ο��� try-catch ������� ����ó���� �� �� ������ ��κ��� �ڽ��� ȣ���� ������ ���ܸ� ó���ϵ��� throws Ű����� ���ܸ� �ѱ�
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			throw new BalanceInsufficientException("�ܰ� ����! : " + (money - balance) + "���ڶ�"); 
		}
		balance -= money;
	}
}
