package sec06_throws;

public class ThrowsExample {

	// main() �޼��忡���� throws Ű���带 ����ؼ� ���ܸ� ���ѱ� �� ������, main() �޼��忡 throws Exception�� ���̴� ���� �ٶ������� �ʴ�.
	public static void main(String[] args) {
		// throws Ű���尡 �پ��ִ� �޼���� �ݵ�� try ��� ������ ȣ��Ǿ�� �Ѵ�.
		// �׸��� catch ��Ͽ��� ���Ѱ� ���� ���ܸ� ó���ؾ� �Ѵ�.
		try  {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}

	}

	// throws : �޼��� ����� ���� �ۼ�, �޼��忡�� ó������ ���� ���ܸ� ȣ���� ������ ���ѱ�� ����
	// �߻��� �� �ִ� ���ܸ� �������� throws �ڿ� �����ϴ� ���� �Ϲ���������, Exception(���� Ŭ����)������ ��� ���ܸ� ������ ���ѱ� �� �ִ�.
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}
}
