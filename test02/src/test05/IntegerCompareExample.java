package test05;

public class IntegerCompareExample {
	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println( obj1 == obj2 );
		System.out.println( obj3 == obj4 );
		
		// ���� ������ -128~127�̸� == �����ڴ� ���� ���ϰ� �� �̿ܿ��� ������ ���Ѵ�.
		
		// Wrapper Class�� Integer Class�� -128 ~ 127 ������ ���ڴ� ==���� ������ ���� ���� �� �ִ�.
		// ���� 100�� �����ȿ� �ش��ϹǷ� �񱳰� �����ؼ� true���� ��ȯ�Ѵ�.
		// Integer�� ��� -128 ~ 127 �� ������ �Ѵ� ���ڴ� ==���� ���� �� ����,
		// ���� Ŭ������ ���� ���� ���ϵ��� �������̵� �� equals() �޼ҵ�� ���ؾ� �Ѵ�.
	}
}