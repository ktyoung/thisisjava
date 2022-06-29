package sec04.exam01_arithmetic;

public class InputDataCheckNaNExample2 {

	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf( userInput );
		
		double currentBalance = 10000.0;
		
		// NaN을 숫자로 초기화
		if(Double.isNaN(val)) { 
			// val이 숫자가 아니므로 True, 아래구문 실행
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val = 0.0; // val을 0.0으로 초기화
		}
		
		currentBalance += val; // val이 0.0이므로 올바른 연산 가능
		System.out.println(currentBalance);


	}

}
