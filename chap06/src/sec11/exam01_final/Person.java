package sec11.exam01_final;

public class Person {
	// final : ���� �� ���� ���� �� �ִ� Entity�� ������ �� ����� 
	// �� �ʱⰪ�� ����Ǹ� �������� ���� �Ǿ� ���α׷� ���� ���߿��� ������ �� �� ����
	// �� static�� �޸�(static�� ��ü �ϳ��� ����) ��ü���� ������ ��
	
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
