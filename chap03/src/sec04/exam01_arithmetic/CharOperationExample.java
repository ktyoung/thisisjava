package sec04.exam01_arithmetic;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1; // 유니코드 65(A) + 1 = 유니코드 66(B)
		char c2 = 'A';
		// char c3 = c2 + 1; // 유니코드(정수형) 연산이 불가함. 컴파일 에러
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		// System.out.println("c3 : " + c3);
	}

}
