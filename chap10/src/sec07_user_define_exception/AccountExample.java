package sec07_user_define_exception;

public class AccountExample {

	// ��� ���� ��ü�� Exception Ŭ������ ����ϱ� ������, Exception�� ������ �ִ� �޼������ ��� ���� ��ü���� ȣ���� �� �ִ�.
	// ���� ����ϴ� �޼��� 1: getMessage();, 2: printStackTrace();
	public static void main(String[] args) {
		Account account = new Account();
		
		// �����ϱ�
		account.deposit(10000);
		System.out.println("���ݾ� : " + account.getBalance());
		
		// ����ϱ�
		try {
			account.withdraw(30000);
		} catch(BalanceInsufficientException e) {	// ���� �޽��� ���
			String message = e.getMessage();		// ���� �޽����� catch ��Ͽ��� getMessage() �޼����� ���� ������ ���� �� �ִ�.
			System.out.println(message);
			System.out.println();
			e.printStackTrace();					// ���� ���� �� ���
		}

	}

}