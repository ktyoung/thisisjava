package sec04.exam01_arithmetic;

public class StringContactExample {

	public static void main(String[] args) {
		String str1 = "JDK" + 6.0; // ���ڿ� + ���� = ���ڿ�
		String str2 = str1 + " Ư¡"; // ���ڿ��� ���ڿ� �տ��� ����
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0; // ���ڿ� + ���� = ���ڿ�
		String str4 = 3 + 3.0 + "JDK"; // ���� + ���ڿ� = ���� + ���ڿ�
		System.out.println(str3);
		System.out.println(str4);

	}

}
