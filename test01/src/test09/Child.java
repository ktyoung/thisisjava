package test09;

public class Child extends Parent {
	private String name;
	
	public Child() {
		// super();			// ������ super();�� �����Ǿ�� �ϳ�, super�� this�� �Բ� ����� �� ���� �� super();�� �������� ����
		this("ȫ�浿");		// (1) ���ڰ� �ϳ��� �Ʒ� Child(String name) �޼��尡 �����
		// this�� Ŭ���� �̸��� �ǹ��� �� Child()�� Child(String name) 2������ �ǹ��ϰ� ��
		System.out.println("Child() call");				// (8) ����
	}
	
	public Child(String name) {	// �Ű������� �ϳ��� �����ڴ� super();�� ȣ��
		super();			// (2) Parent Ŭ������ Parent �޼��带 ����Ŵ
		this.name = name;	// �ʵ忡 ���� this�̹Ƿ�~ Child(String name)�� �ǹ���  
		System.out.println("Child(String name) call");	// (7) ����
	}
}
