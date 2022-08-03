package sec10.exam01_wrapper;

// ���� ��ü�� ������ ���� ���ϱ� ���� == �����ڿ� != �����ڸ� ����� �� ����.
// �ش� �����ڵ��� ������ ���� ���ϴ� ���� �ƴ϶�, ���� ��ü�� ����(������)�� ���ϱ� ����.
// ��, ������ ���� ���Ϸ��� ��ڽ��� ���� ���� ���ؾ� �Ѵ�.
// ����, ���� ���� ���� ��ڽ��ؼ� ���ϰų�, equals() �޼���� ���� ���� ���ϴ� ���� ����.
public class ValueCompareExample {

	public static void main(String[] args) {
		System.out.println("[-128~127 �ʰ����� ���]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==��� : " + (obj1==obj2));	// false
		System.out.println("��ڽ� �� == ��� : " + (obj1.intValue() == obj2.intValue()));
		
		System.out.println("[-128~127 �ʰ����� ���]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==��� : " + (obj3==obj4));
		System.out.println("��ڽ� �� == ��� : " + (obj3.intValue() == obj4.intValue()));
	}

}
