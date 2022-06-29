package sec04.exam05_bit;

public class BitShiftExample {

	public static void main(String[] args) {
		// 왼쪽 shift 연산자 : 오른쪽 빈 공간은 0으로 채움
		System.out.println("1 << 3 = " + (1 << 3)); // 비트열을 왼쪽으로 3칸 이동
		// 오른쪽 shift 연산자 : 왼쪽 빈 공간을, 음수일 때 : 1로, 양수일 때 : 0으로 채움
		System.out.println("-8 >> 3 = " + (-8 >> 3)); // 비트열을 오른쪽으로 3칸 이동
		System.out.println("-8 >>> 3 = " + (-8 >>> 3)); // 
		
		System.out.println();
		System.out.println(toBinaryString(1));
		System.out.println("<< 3");
		System.out.println("--------------------------------");
		System.out.println(toBinaryString(1 << 3));
	}

	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}
}
