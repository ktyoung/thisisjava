package sec03.exam02_gc;

public class GcExample {

	public static void main(String[] args) {
		Employee emp;
		
		emp = new Employee(1);	// ������ ��ü�� ��
		emp = null;
		emp = new Employee(2);	// ������ ��ü�� ��
		emp = new Employee(3);
		
		System.out.print("emp�� ���������� �����ϴ� �����ȣ: ");
		System.out.println(emp.eno);
		System.gc();			// ������ ������ �����û

	}

}
