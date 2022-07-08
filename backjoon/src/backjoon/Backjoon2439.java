package backjoon;

import java.util.Scanner;

public class Backjoon2439 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=(5-1); j>=i; j--) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}
}