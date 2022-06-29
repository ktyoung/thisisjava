package sec04.exam05_bit;

public class BitLogicExample {

	public static void main(String[] args) {
		// AND 연산
		System.out.println("45 & 25 = " + (45 & 25));
		// OR 연산
		System.out.println("45 | 25 = " + (45 | 25));
		// XOR 연산
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		// 보수 연산(비트 반전)
		System.out.println("~45 = " + (~45));
		
		System.out.println();
		System.out.println(toBinaryString(45));
		System.out.println("&");
		System.out.println(toBinaryString(25));
		System.out.println("--------------------------------");
		System.out.println(toBinaryString(45 & 25));
	}
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}

}
