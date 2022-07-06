package backjoon;

import java.util.Scanner;

public class Backjoon14681 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int quadrant = 0;
		
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		y = sc.nextInt();

		if (x>0 && y>0) {
			quadrant = 1;
			System.out.println(quadrant);
		} else if (x<0 && y>0) {
			quadrant = 2;
			System.out.println(quadrant);
		} else if (x<0 && y<0) {
			quadrant = 3;
			System.out.println(quadrant);
		} else {
			quadrant = 4;
			System.out.println(quadrant);
		}
	}

}
