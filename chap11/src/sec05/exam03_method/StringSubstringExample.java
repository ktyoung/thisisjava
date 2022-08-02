package sec05.exam03_method;

// 메서드에 주어진 인덱스에서 문자열을 추출하는 substring()
public class StringSubstringExample {

	public static void main(String[] args) {
		String ssn = "123456-1234567";
		
		String firstNum = ssn.substring(0, 6);	// 주어진 시작과 끝 인덱스 사이의 문자열 추출
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);	// 주어진 인덱스 이후부터 끝까지 문자열 추출
		System.out.println(secondNum);
	}

}
