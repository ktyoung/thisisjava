package sec05.exam01_constructor;

// 자바의 문자열은 java.lang 패키지의 String 클래스의 인스턴스로 관리
public class ByteToStringExample {

	public static void main(String[] args) {
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6 , 4);	// 74번 위치에서 4개
		System.out.println(str2);

	}

}
