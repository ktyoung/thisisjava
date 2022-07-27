package sec03_try_catch_finally;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		// try ��Ͽ��� ���� �߻� ���ɼ��� �ִ� �ڵ尡 ��ġ�Ѵ�.
		// try ��Ͽ��� ���ܰ� �߻����� �ʰ� ���������� ����Ǹ� catch ����� ������� �ʰ�, finally ����� �ڵ带 �����Ѵ�.
		// ����, try ��Ͽ��� ���ܰ� �߻��ϸ�, ��� ������ ���߰� catch ������� �̵��Ͽ� ���� ó�� �ڵ带 �����Ѵ�.
		// ���� finally ����� �ڵ带 �����Ѵ�.
		
		try {
			Class clazz = Class.forName("java.lang.String2");	// Class.forName() �޼���� �Ű������� �־��� Ŭ������ �����ϸ� Class ��ü�� ����
																// �������� ������ ClassNotFoundException ���ܸ� �߻���Ų��.

		} catch(ClassNotFoundException e) {						// forName()�� �Ű������� �־��� java.lang.String2 Ŭ������ �������� �ʾƼ�
																// ���ܰ� �߻��ϰ� ��.
																// ���� catch ����� �����Ͽ� ���� ó���� �ϰ� �ȴ�.
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}
}
