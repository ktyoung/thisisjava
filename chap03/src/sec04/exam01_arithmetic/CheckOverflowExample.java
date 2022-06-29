package sec04.exam01_arithmetic;

public class CheckOverflowExample {

	public static void main(String[] args) {
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		} catch(ArithmeticException e) { // 예외가 발생하면 아래 구문이 실행됨
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
		}

	}

	public static int safeAdd(int left, int right) {
		if((right>0)) {
			if(left>(Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생"); // ArithmeticException에 예외값을 throw함
			}
		} else {
			if(left<(Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		return left + right;
	}
}