package sec04.exam01_arithmetic;

public class InputDataCheckNaNExample2 {

	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf( userInput );
		
		double currentBalance = 10000.0;
		
		// NaN�� ���ڷ� �ʱ�ȭ
		if(Double.isNaN(val)) { 
			// val�� ���ڰ� �ƴϹǷ� True, �Ʒ����� ����
			System.out.println("NaN�� �ԷµǾ� ó���� �� ����");
			val = 0.0; // val�� 0.0���� �ʱ�ȭ
		}
		
		currentBalance += val; // val�� 0.0�̹Ƿ� �ùٸ� ���� ����
		System.out.println(currentBalance);


	}

}
