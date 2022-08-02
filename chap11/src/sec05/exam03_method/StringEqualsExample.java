package sec05.exam03_method;

// 자바는 문자열 리터럴이 동일하다면 동일한 String 객체를 참조하도록 되어있다.
// 두 객체의 문자열만 비교하려면 == 연산자 대신 equals() 메서드를 사용해야 한다.
public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = new String("홍길동");
		String strVar2 = "홍길동";
		
		if(strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}
	}

}
