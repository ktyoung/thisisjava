package sec04.exam01_arithmetic;

public class OverflowExample {

	public static void main(String[] args) {
		/* int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z); */
		// int형 범위를 넘기 때문에 쓰레기 값이 출력됨.
		
		long x = 1000000;
		long y = 1000000;
		long z = x * y;
		System.out.println(z);
	}

}
