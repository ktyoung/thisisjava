package sec02_runtime_exception;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);	// 문자열로 되어있는 데이터를 숫자로 변환하는 Integer.parseInt(String s); 메서드
		int value2 = Integer.parseInt(data2);	// → 문자열을 정수로 변환하여 반환
												// Integer은 포장 클래스라 한다. 이 클래스의 parseXXX() 메서드는 문자열을 숫자로 변환할 수 있다.
												// 이 메서드들은 매개값이 문자열이 숫자로 
		int result = value1+ value2;
		System.out.println(data1 + "+" + data2 + "+" + result);
		

	}

}
