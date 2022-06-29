package sec04.exam01_arithmetic;

public class StringContactExample {

	public static void main(String[] args) {
		String str1 = "JDK" + 6.0; // 문자열 + 숫자 = 문자열
		String str2 = str1 + " 특징"; // 문자열과 문자열 합연산 가능
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0; // 문자열 + 숫자 = 문자열
		String str4 = 3 + 3.0 + "JDK"; // 숫자 + 문자열 = 숫자 + 문자열
		System.out.println(str3);
		System.out.println(str4);

	}

}
