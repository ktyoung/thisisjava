package sec07.exam02_field_initialize;

public class Korean {

	// �ʵ�
	String nation = "���ѹα�";
	String name; // �����ڸ� ���� �ʵ� ���� ������
	String ssn;
	
	// ������
	
	// �Ʒ��� �����ϰ� �����ϴ� �ڵ�
	/*	
		public Korean(String n, String s) {
		name = n;
		ssn = s;
	}	
	*/

	public Korean(String name, String ssn) {
		this.name = name; // this : �׶��׶� �ԷµǴ� ���� ������ �� �ٱ� name(��ü)�� ���ڷ� �޾�  �ʵ� name�� ������
		this.ssn = ssn;
	}
}