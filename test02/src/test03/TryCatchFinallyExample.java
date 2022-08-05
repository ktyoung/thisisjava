package test03;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		String[] strArray = { "10", "2a" };
		int value = 0;
		for(int i=0; i<=2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과했음");
			} catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음");
			} finally {
				System.out.println(value);
			}
		}
	}
}

// 10 → value = strArray[0] = 10
// 숫자로 변환할 수 없음 → value = strArray[1] = 2a > 문자가 포함되어 예외 발생
// 10 → value = 10 (finally 구문 실행)
// 인덱스를 초과했음 → strArray의 인덱스는 0, 1 뿐이므로 i가 2일 때 인덱스 초과 예외 발생
// 10 → value = 10 (finally 구문 실행)