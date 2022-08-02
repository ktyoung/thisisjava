package sec05.exam03_method;

// 문자열의 길이를 리턴하는 length()
public class StringLengthExample {

	public static void main(String[] args) {
		String ssn = "1234561234567";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		} else {
			System.out.println("주민번호 자리수가 틀립니다.");
		}

	}

}
