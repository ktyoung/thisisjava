package sec03.exam03_accuracy;

public class FromIntToFloat {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2;		// num3 = 1.2345678E8
		// float num3 = num2;	// num3 = 1.23456784E8
		num2 = (int) num3;		// (float일 때) num2 = 123456784
								// (double일 때) num2 = 123456780
		
		// num3의 타입이 double형이어야 올바른 연산(결과 : 0)이 됨.
		int result = num1 - num2;
		System.out.println(result);

	}

}
