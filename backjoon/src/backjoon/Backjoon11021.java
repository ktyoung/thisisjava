package backjoon;

import java.util.Scanner;

public class Backjoon11021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b = 0;
		int count = 0;
		count = sc.nextInt();
		
		for(int i=1; i<=count; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Case #" + i + ": " + (a+b));
		}

	}

}
