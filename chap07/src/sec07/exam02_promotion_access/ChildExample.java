package sec07.exam02_promotion_access;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		// �θ� Ÿ������ �ڵ� Ÿ�� ��ȯ�� ������ �θ� Ŭ������ ����� �ʵ�� �޼��忡�� ���� �����ϴ�.
		
		Parents parents = child;	// �ڵ� Ÿ�� ��ȯ
									// Parents Ÿ��  parents ������ Child ��ü�� ������ �� �ִ�.
									// Child ��ü�� Paretns ��ü�� ��� �޾ұ� �����̴�.
		
		parents.method1();			// �θ��� method1 �޼��� ȣ�� ����
		
		parents.method2();			// ������ �� �ڽ��� �޼��� ȣ��(�ڽ��� method2 ȣ��)
									// �޼��尡 �ڽ��� Ŭ�������� �������̵� �Ǿ��ٸ�, �ڽ� Ŭ������ �޼���(������ �� �޼���)�� ��� ȣ��ȴ�. (�������� ����)
									// �������̵� �Ǿ��ٸ�, �ڽ� Ŭ������ �޼��忡 ���� �����ϴ�.
		
		// parents.method3();		// ȣ�� �Ұ���

	}

}
