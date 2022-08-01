package sec03.exam01_exit;

// exit() �޼���� ���� �����ϰ� �ִ� ���μ����� ���� �����Ű�� ������ �Ѵ�.
// �Ϲ������� ���� ������ ��� 0���� �����ϰ�, ������ ������ ��� 0 �̿��� �ٸ� ���� �ش�.
// System.exit() �޼��尡 ����Ǹ� ���� �������� checkExit() �޼��尡 �ڵ� ȣ�� �� checkExit() �޼��尡 ���� ����Ǹ� JVM ����
public class ExitExample {

	public static void main(String[] args) {
		// ���� ������ ����
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) {
				if(status != 5) {
					throw new SecurityException();
				}
			}
		});
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			try {
				System.exit(i);
			} catch(SecurityException e) {}
		}

	}

}
