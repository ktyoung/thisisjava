package sec04.exam03_compare;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		String strVar3 = new String("�Ź�ö"); // ���ڿ��� �ƴ� ��ü�� �ν���
		
		System.out.println(strVar1 == strVar2); // (���ڿ�)�Ź�ö == (���ڿ�)�Ź�ö
		System.out.println(strVar1 == strVar3); // (���ڿ�)�Ź�ö != (��   ü)�Ź�ö
		System.out.println();
		
		// equals�� ���°� ������ �ľ��� (���� Ÿ�԰� �������)
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3)); 

	}

}
