package sec07_user_define_exception;

// �����Ϸ��� üũ�ϴ� �Ϲ� ���ܷ� �����ϰų� , �����Ϸ��� üũ���� �ʴ� ���� ���ܷ� ������ �� �ִ�.
// �Ϲ� ���ܷ� ���� �� �� Exception ���, ���� ���ܷ� ���� �� �� RuntimeException ���
public class BalanceInsufficientException extends Exception {
	// �����ڴ� 2���� �����ϴ� ���� �Ϲ����̴�.
	// �ϳ��� �Ű������� ���� �⺻ ������, �ٸ� �ϳ��� ���� �߻� ����(���� �޽���)�� �����ϱ� ���� String Ÿ���� �Ű������� ���� ������. 
	public BalanceInsufficientException() {}
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
