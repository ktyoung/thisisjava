package sec00.exam00_ForMultiplicationTable;

public class ForMultiplicationTable {

	public static void main(String[] args) {
		for(int k=2; k<=9; k++) {
			System.out.print("[" + k + "]´Ü" + "\t\t");
		}
		System.out.println(" ");
		
		for(int j=1; j<=9; j++) {
			for(int i=2; i<=9; i++) {		
				System.out.print(i + " x " + j + " = " + (i*j) + "\t");
			}
			System.out.println(" ");
		}
	}
}