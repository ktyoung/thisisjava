package sec05.exam01_constructor;

// �ڹ��� ���ڿ��� java.lang ��Ű���� String Ŭ������ �ν��Ͻ��� ����
public class ByteToStringExample {

	public static void main(String[] args) {
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6 , 4);	// 74�� ��ġ���� 4��
		System.out.println(str2);

	}

}
