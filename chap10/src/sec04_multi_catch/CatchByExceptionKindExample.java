package sec04_multi_catch;

public class CatchByExceptionKindExample {
	
	public static void main(String[] args) {
		// try 블록 내부에는 다양한 종류의 예외가 발생할 수 있다.
		// 발생되는 예외에 따라 예외 처리 코드를 다르게 지정하려면 다중 catch문을 사용해야 한다.
		
		// catch문이 여러개 존재하더라도 단 하나의 catch 블록만 실행된다.
		// try 블록에서 동시다발적으로 예외가 발생하지 않고, 실행되는 순서에 따라 하나의 예외가 발생하면,
		// 즉시 실행을 멈추고 해당 catch 블록으로 이동되기 때문이다.
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");
			return;
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}

}