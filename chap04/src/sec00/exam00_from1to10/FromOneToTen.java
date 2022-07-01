package sec00.exam00_from1to10;

public class FromOneToTen {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		for(i=1; i<=10; i++) {
			sum += i;
			System.out.print(i);
			
			if(i != 10) {
				System.out.print("+");
			}
		}
		
		System.out.print("=" + sum);
	}
}


