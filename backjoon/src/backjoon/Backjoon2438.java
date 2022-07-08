package backjoon;

import java.util.Scanner;

public class Backjoon2438 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}