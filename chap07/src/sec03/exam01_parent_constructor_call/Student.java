package sec03.exam01_parent_constructor_call;

public class Student extends People {
	// �ڽ� Ŭ����
	
	public int studentNo;
	
	// �θ� Ŭ������ �⺻ �����ڰ� ���� �Ű������� �ִ� �����ڸ� �ִٸ�
	// �ڽ� Ŭ�������� �ݵ�� �θ� ������ ȣ���� ���� super(�Ű���1, ...)�� ��������� ȣ���ؾ� �Ѵ�.
	// super�� �ݵ�� �ڽ� ������ ù �ٿ� ��ġ�ؾ� �Ѵ�.
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); // �θ� ������ ȣ��
		this.studentNo = studentNo;
	}
}
