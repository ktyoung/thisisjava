package sec01.exam06_finalize;

// finalize() : ��ü �Ҹ���
// �������� �ʴ� �迭�̳� ��ü�� ������ ������(Garbage Collector)�� �� �������� �ڵ����� �Ҹ��Ŵ
// ������ ������� ��ü�� �Ҹ��ϱ� ������ ���������� ��ü �Ҹ��ڸ� �����Ų��.
// ��ü�� �Ҹ�Ǳ� ���� ���������� ����ߴ� �ڿ�(������ ����, ���� ��)�� �ݰ� �Ͱų�, �߿��� �����͸� �����ϰ� �ʹٸ� Object�� finalize()�� �������� �� �ִ�. 
public class Counter {
	private int no;
	
	public Counter(int no) {
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "�� ��ü�� finalize()�� �����");
	}
	
}
