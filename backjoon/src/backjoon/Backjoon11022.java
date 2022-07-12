package backjoon;

import java.util.Scanner;

public class Backjoon11022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, count = 0;

		count = sc.nextInt();
		for(int i=1; i<=count; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a+b));
		}
	}

}
