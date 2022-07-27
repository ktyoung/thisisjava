package sec03_try_catch_finally;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		// try ��Ͽ��� ���� �߻� ���ɼ��� �ִ� �ڵ尡 ��ġ�Ѵ�.
		// try ��Ͽ��� ���ܰ� �߻����� �ʰ� ���������� ����Ǹ� catch ����� ������� �ʰ�, finally ����� �ڵ带 �����Ѵ�.
		// ����, try ��Ͽ��� ���ܰ� �߻��ϸ�, ��� ������ ���߰� catch ������� �̵��Ͽ� ���� ó�� �ڵ带 �����Ѵ�.
		// ���� finally ����� �ڵ带 �����Ѵ�.
		
		// finally : ���� �߻� ���ο� ������� �׻� ������ ����.
		// try, catch ��Ͽ��� return���� ����ϴ��� finally ����� �׻� ����ȴ�.
		
		try {
			Class clazz = Class.forName("java.lang.String2");	// Class.forName() �޼���� �Ű������� �־��� Ŭ������ �����ϸ� Class ��ü�� ����
																// �������� ������ ClassNotFoundException ���ܸ� �߻���Ų��.
		} catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}
}
