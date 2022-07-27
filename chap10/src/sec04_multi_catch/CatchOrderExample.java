package sec04_multi_catch;

public class CatchOrderExample {

	public static void main(String[] args) {
		// 다중 catch 블록을 작성 시 상위 예외 클래스가 하위 예외 클래스보다 아래쪽에 위치해야 한다.
		// try 블록에서 예외가 발생하면, catch 블록은 위에서부터 차례대로 검색된다.
		// 만약 상위 예외 클래스 catch 블록이 위에 존재한다면, 하위 catch 블록은 실행되지 않는다.
		// 하위 예외 클래스는 상위 예외 클래스를 상속했기 때문에, 상위 예외 타입도 되기 때문이다.
		try {
			// ArrayIndexOutOfBoundsException 예외 발생 → 20번 catch문 실행
			// NumberFormatException 예외 발생 → 22번 catch문 실행
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		// 22번 catch문(상위 예외 클래스)가 20번 catch문(하위 예외 클래스)보다 위에 있으면 22번 catch문만 실행됨
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch (Exception e) {
			System.out.println("실행에 문제가 있습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}