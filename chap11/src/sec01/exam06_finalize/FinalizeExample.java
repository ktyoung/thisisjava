package sec01.exam06_finalize;

public class FinalizeExample {

	public static void main(String[] args) {
		Counter counter = null;
		for(int i=1; i<=50; i++) {		// �ݺ����� ��ü ����
			counter = new Counter(i);
			counter = null;				// Counter ��ü�� ������� ����
			System.gc();				// ������ ������ ���� ��û
		}
	}

}