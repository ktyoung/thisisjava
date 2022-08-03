package sec10.exam01_wrapper;

// �ڵ� Boxing�� ���� Ŭ���� Ÿ�Կ� �⺻ ���� ���Ե� ��� �߻�
// �ڵ� Unboxing�� �⺻ Ÿ�Կ� ���� ��ü�� ���Ե� ��� �߻�
public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// Boxing
		Integer obj = 100;
		System.out.println("value : " + obj.intValue());
		
		// ���� �� Unboxing
		int value = obj;
		System.out.println("value : " + value);
		
		// ���� �� �ڵ� Unboxing
		int result = obj + 100;
		System.out.println("result : " + result);
	}

}
