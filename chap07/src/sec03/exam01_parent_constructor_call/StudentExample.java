package sec03.exam01_parent_constructor_call;

public class StudentExample {
	// �ڽ� ��ü �̿�
	
	public static void main(String[] args) {
		Student student = new Student("ȫ�浿", "123456-12345467", 1);
		System.out.println("name : " + student.name);	// �θ𿡰� ��ӹ��� �ʵ� ���
		System.out.println("ssn : " + student.ssn);		// �θ𿡰� ��ӹ��� �ʵ� ���
		System.out.println("studentNo : " + student.studentNo);

	}

}
