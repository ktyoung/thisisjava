package sec03.exam03_accuracy;

public class FromIntToFloat {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2;		// num3 = 1.2345678E8
		// float num3 = num2;	// num3 = 1.23456784E8
		num2 = (int) num3;		// (float�� ��) num2 = 123456784
								// (double�� ��) num2 = 123456780
		
		// num3�� Ÿ���� double���̾�� �ùٸ� ����(��� : 0)�� ��.
		int result = num1 - num2;
		System.out.println(result);

	}

}