package backjoon;

import java.util.Scanner;

public class Backjoon10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = { 0 };
		int n, x, val = 0;
		n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			val = sc.nextInt();
			arr[i] = val;
			System.out.println(arr[i]);
			
		}
		
	}

}
