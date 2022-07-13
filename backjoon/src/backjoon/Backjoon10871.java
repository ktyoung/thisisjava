package backjoon;

import java.util.Scanner;

public class Backjoon10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int x = 0;
		
		n = sc.nextInt();
		x = sc.nextInt();
		
		for(int i=0; i<n ;i++) {
			int temp = sc.nextInt();
			
			if(temp < x) {
				System.out.print(temp + " ");				
			}
		}
		
		
	}

}
