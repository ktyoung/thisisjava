package sec05.exam01_string_equals;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "���¿�"; // stack ������ �����
		String strVar2 = "���¿�"; // stack ������ �����

		if(strVar1 == strVar2) {
			System.out.println("strVar1�� strVar2�� ������ ����");
		} else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ�");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����"); // Ÿ�� ������� ���ڿ��� ����
		}
		System.out.println(" ");
		
		String strVar3 = new String("���¿�"); // heap ������ �����(���� ��ü�̹Ƿ� �ٸ� �ּҿ� �����)
		String strVar4 = new String("���¿�"); // heap ������ �����(���� ��ü�̹Ƿ� �ٸ� �ּҿ� �����) 
		if(strVar3 == strVar4) {
			System.out.println("strVar3�� strVar4�� ������ ����");
		} else {
			System.out.println("strVar3�� strVar4�� ������ �ٸ�");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3�� strVar4�� ���ڿ��� ����");
		}
	}

}
