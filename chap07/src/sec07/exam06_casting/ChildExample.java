package sec07.exam06_casting;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		�θ� Ŭ������ �������� �ʴ� �ʵ�� �޼����̹Ƿ� ���� �Ұ�
		parent.field2 = "data2";
		parent.method3();
		*/
		
		// �ڽ� ��ü ����
		Child child = (Child) parent;	// �θ��� ��ü�� �ڽ��� ��ü�� ���� ����ȯ(Casting)�� �� �ڽ��� �޼���� �ʵ� ��� ����
		child.field2 = "yyy";
		child.method3();

	}

}
