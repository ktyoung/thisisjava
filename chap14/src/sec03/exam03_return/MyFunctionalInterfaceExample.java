package sec03.exam03_return;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		// ���ϰ��� �ִ� ���ٽ� �ۼ��ϱ�
		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		// ���ٽ� �����ϱ�
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> { return x + y; };
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> x + y;
		System.out.println(fi.method(2, 5));
		
		// ���ٽİ� ����� ���� �Լ��� �Բ� ����ϱ�
		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method(2, 5));
		
	}
	public static int sum(int x, int y) {
		return (x + y);
	}
}