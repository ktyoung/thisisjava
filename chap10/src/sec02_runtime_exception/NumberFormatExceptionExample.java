package sec02_runtime_exception;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);	// ���ڿ��� �Ǿ��ִ� �����͸� ���ڷ� ��ȯ�ϴ� Integer.parseInt(String s); �޼���
		int value2 = Integer.parseInt(data2);	// �� ���ڿ��� ������ ��ȯ�Ͽ� ��ȯ
												// Integer�� ���� Ŭ������ �Ѵ�. �� Ŭ������ parseXXX() �޼���� ���ڿ��� ���ڷ� ��ȯ�� �� �ִ�.
												// �� �޼������ �Ű����� ���ڿ��� ���ڷ� 
		int result = value1+ value2;
		System.out.println(data1 + "+" + data2 + "+" + result);
		

	}

}
