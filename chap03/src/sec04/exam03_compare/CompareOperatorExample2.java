package sec04.exam03_compare;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); // 1 == 1.0
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); // 0.1 != 0.1f
		System.out.println((float)v4 == v5); // 0.1f == 0.1f
		System.out.println((int)(v4*10) == (int)(v5*10)); // 1 == 1 
		

	}

}
