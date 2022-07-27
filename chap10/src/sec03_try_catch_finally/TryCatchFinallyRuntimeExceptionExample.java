package sec03_try_catch_finally;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		// 매개값의 수가 부족하면 → ArrayIndexOutOfBoundsException 예외 발생
		try {
			data1 = args[0];
			data2 = args[1];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");
			return;
		}
		
		// parseXXX() 메서드로 문자열을 숫자로 변환할 수 없으면 → NumberFormatException 예외 발생
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
			
		// finally : 예외 발생 여부와 상관없이 항상 실행할 내용.
		// try, catch 블록에서 return문을 사용하더라도 finally 블록은 항상 실행된다.
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}
