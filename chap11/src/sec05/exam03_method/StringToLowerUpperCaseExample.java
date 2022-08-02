package sec05.exam03_method;

// 문자열을 모두 소문자, 대문자로 바꾼 새로운 문자열을 생성한 후 리턴하는 toLowerCase(), toUpperCase()
// equalsIgnoreCase() 메서드를 사용하면 대소문자를 맞추는 작업을 생략 가능하다.
public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String upperStr1 = str1.toUpperCase();
		System.out.println(lowerStr1);
		System.out.println(upperStr1);
		
		String lowerStr2 = str2.toLowerCase();
		String upperStr2 = str2.toUpperCase();
		System.out.println(lowerStr2);
		System.out.println(upperStr2);
		
		System.out.println(lowerStr1.equals(lowerStr2));
		System.out.println(upperStr1.equals(upperStr2));
		
		System.out.println(str1.equalsIgnoreCase(str2));

	}

}
