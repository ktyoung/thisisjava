package sec07.exam01_promotion_access;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		// �θ� Ÿ������ �ڵ� Ÿ�� ��ȯ�� ������ �θ� Ŭ������ ����� �ʵ�� �޼��忡�� ���� �����ϴ�.
		Parents parents = child;	// �ڵ� Ÿ�� ��ȯ
		
		parents.method1();			// �θ��� method1 �޼��� ȣ�� ����
		parents.method2();			// ������ �� �ڽ��� �޼��� ȣ��(�ڽ��� method2 ȣ��)
		// parents.method3();			// ȣ�� �Ұ���

	}

}
