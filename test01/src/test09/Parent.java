package test09;

public class Parent {
	public String nation;
	
	public Parent() {
		this("���ѹα�");			// (3) Parent()�� Parent(String nation) 2������ �ǹ��ϰ� ��
								// �� ���ڰ� �ϳ��� �Ʒ� Parent(String nation) �޼��尡 �����
		
		System.out.println("Parent() call");	// // (6) ����
	}
	
	public Parent(String nation) {
		this.nation = nation;	// (4) Parent(String nation) �޼��带 �ǹ���
		System.out.println("Parent(String nation) call");	// (5) ����
	}
}
