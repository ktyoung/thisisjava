package sec04.exam05_bit;

public class BitShiftExample {

	public static void main(String[] args) {
		// ���� shift ������ : ������ �� ������ 0���� ä��
		System.out.println("1 << 3 = " + (1 << 3)); // ��Ʈ���� �������� 3ĭ �̵�
		// ������ shift ������ : ���� �� ������, ������ �� : 1��, ����� �� : 0���� ä��
		System.out.println("-8 >> 3 = " + (-8 >> 3)); // ��Ʈ���� ���������� 3ĭ �̵�
		System.out.println("-8 >>> 3 = " + (-8 >>> 3)); // 
		
		System.out.println();
		System.out.println(toBinaryString(1));
		System.out.println("<< 3");
		System.out.println("--------------------------------");
		System.out.println(toBinaryString(1 << 3));
	}

	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}
}
