package sec02_runtime_exception;

public class ArrayIndexOutOfBoundsExeptionExample {
	// �迭���� �ε��� ������ �ʰ��ؼ� ����� ��� �߻�
	// ���� ���, ���̰� 3�� int[] = new int[3]; �迭�� �������� ��, �迭 �׸��� �����ϱ� ���� arr[0]~arr[2]���� ����� �� �ִ�.
	// ������ arr[3] ��� �� �ε��� ������ �ʰ��ϱ� ������ ���ܰ� �߻��Ѵ�.
	
	public static void main(String[] args) {
		if(args.length == 2) {	
			String data1 = args[0];		// ���� �Ű��� args �迭�� �Ű� ������ �Ѱ����� �ʾұ� ������ args[0], args[1]�� ���� �ε����� ����� �� ����.
			String data2 = args[1];		// ���� �迭 ���� �б� ���� �迭�� ���̸� ���� �����Ͽ� ���� �߻��� ������ �����ؾ� �Ѵ�.
										// ���� �Ű����� ���ų� ������ ���, ���ǹ��� �̿��ؼ� ����ڿ��� ���� ����� �˸���.
			System.out.println("args[0] : " + data1);
			System.out.println("args[1] : " + data2);
		} else {
			System.out.println("[���� ���]");
			System.out.println("ArrayIndexOutOfBoundsExeptionExample");
			System.out.println("��1    ��2");
		}

	}

}