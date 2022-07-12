package backjoon;

import java.util.Scanner;

public class Backjoon10950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int count = 0;
		
		count=sc.nextInt();
		
		for(int i=0; i<count; i++) {
			a=sc.nextInt();
			b=sc.nextInt();
			
			System.out.println(a + b);
		}
	}

}
