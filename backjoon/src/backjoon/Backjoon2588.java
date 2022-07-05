package backjoon;

import java.util.Scanner;

public class Backjoon2588 {

	public static void main(String[] args) {
		int A = 0;
		int B = 0;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		num1 = (B%10)*A;
		num2 = ((B%100)/10)*A;
		num3 = (B/100)*A;
		
		System.out.println( num1 );
		System.out.println( num2 );
		System.out.println( num3 );
		System.out.println( A*B );
		
	}

}
