package sec04_multi_catch;

public class CatchOrderExample {

	public static void main(String[] args) {
		// ���� catch ����� �ۼ� �� ���� ���� Ŭ������ ���� ���� Ŭ�������� �Ʒ��ʿ� ��ġ�ؾ� �Ѵ�.
		// try ��Ͽ��� ���ܰ� �߻��ϸ�, catch ����� ���������� ���ʴ�� �˻��ȴ�.
		// ���� ���� ���� Ŭ���� catch ����� ���� �����Ѵٸ�, ���� catch ����� ������� �ʴ´�.
		// ���� ���� Ŭ������ ���� ���� Ŭ������ ����߱� ������, ���� ���� Ÿ�Ե� �Ǳ� �����̴�.
		try {
			// ArrayIndexOutOfBoundsException ���� �߻� �� 20�� catch�� ����
			// NumberFormatException ���� �߻� �� 22�� catch�� ����
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		// 22�� catch��(���� ���� Ŭ����)�� 20�� catch��(���� ���� Ŭ����)���� ���� ������ 22�� catch���� �����
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű����� ���� �����մϴ�.");
		} catch (Exception e) {
			System.out.println("���࿡ ������ �ֽ��ϴ�.");
		} finally {
			System.out.println("�ٽ� �����ϼ���.");
		}
	}
}