package sec03.exam02_gc;

public class Employee {
	public int eno;
	
	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Employee(" + eno + ") �� �޸𸮿� ������");
	}
	
	// ������ �����Ⱑ ��ü�� �����ϴ��� Ȯ���ϱ� ���� ��ü �Ҹ��� finalize()�� �̿��Ѵ�.
	// ������ ������� ��ü�� �����ϱ� ���� ���������� ��ü �Ҹ��ڸ� �����Ѵ�.
	public void finalize() { // �Ҹ���
		System.out.println("Employee(" + eno + ") �� �޸𸮿��� ���ŵ�");
	}
}
