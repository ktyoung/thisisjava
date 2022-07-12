package backjoon;

import java.util.Scanner;

public class Backjoon8393 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		System.out.println(sum);

	}

}
