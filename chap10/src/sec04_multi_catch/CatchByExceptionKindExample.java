package sec04_multi_catch;

public class CatchByExceptionKindExample {
	
	public static void main(String[] args) {
		// try ��� ���ο��� �پ��� ������ ���ܰ� �߻��� �� �ִ�.
		// �߻��Ǵ� ���ܿ� ���� ���� ó�� �ڵ带 �ٸ��� �����Ϸ��� ���� catch���� ����ؾ� �Ѵ�.
		
		// catch���� ������ �����ϴ��� �� �ϳ��� catch ��ϸ� ����ȴ�.
		// try ��Ͽ��� ���ôٹ������� ���ܰ� �߻����� �ʰ�, ����Ǵ� ������ ���� �ϳ��� ���ܰ� �߻��ϸ�,
		// ��� ������ ���߰� �ش� catch ������� �̵��Ǳ� �����̴�.
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű����� ���� �����մϴ�.");
			System.out.println("[���� ���]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");
			return;
		} catch (NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
		} finally {
			System.out.println("�ٽ� �����ϼ���.");
		}
	}

}