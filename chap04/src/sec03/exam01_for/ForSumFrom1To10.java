package sec03.exam01_for;

public class ForSumFrom1To10 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		for(i=1; i<=10; i++) {
			sum += i;
			
			System.out.println(i + "번째 합 ");
			System.out.println("i=" + i + ", sum=" + (sum-i) + ", i+sum= " + sum);
		}
		System.out.println("");
		System.out.println("전체 합 = " + sum);

	}

}
