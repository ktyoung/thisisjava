package sec03.exam05_getenv;

// �ڹ� ���α׷������� ȯ�� ������ ���� �ʿ��� ���, System.getenv() �޼��带 ����Ѵ�.
// �Ű������� ȯ�� ���� �̸��� �ָ� ���� �����Ѵ�.
public class SystemEnvExample {

	public static void main(String[] args) {
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("[ JAVA_HOME ] " + javaHome);

	}

}
