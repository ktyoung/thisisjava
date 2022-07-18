package sec07.exam07_instanceof;

// ��ü Ÿ���� Ȯ���ϴ� instanceof ������
// ����ȯ ���� ���θ� Ȯ���ϸ� true / false�� ����� ��ȯ
// �ַ� ��� ���迡�� �θ�ü���� �ڽİ�ü���� Ȯ���ϴµ� ��� 
// ��������� '��ü + instanceof + Ŭ����'

public class InstanceofExample {
	public static void method1(Parent parent) {
		// Child Ÿ������ ����ȯ�� �������� Ȯ��
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child�� ��ȯ ����");
		} else {
			System.out.println("method1 - Child�� ��ȯ���� ����");
		}
	}
	
	/*
	 	public static void method2(Parent parent) {
		// ����ȯ ���� ����
		Child child = (Child) parent;
		System.out.println("method2 - Child�� ��ȯ ����");
	}
	*/

	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);

	}

}
