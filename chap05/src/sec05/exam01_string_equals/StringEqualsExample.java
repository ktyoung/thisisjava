package sec05.exam01_string_equals;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "김태영"; // stack 영역에 저장됨
		String strVar2 = "김태영"; // stack 영역에 저장됨

		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음"); // 타입 관계없이 문자열은 같음
		}
		System.out.println(" ");
		
		String strVar3 = new String("김태영"); // heap 영역에 저장됨(독립 객체이므로 다른 주소에 저장됨)
		String strVar4 = new String("김태영"); // heap 영역에 저장됨(독립 객체이므로 다른 주소에 저장됨) 
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
	}

}
