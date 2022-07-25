package test04;

public class Question04 {

	public static void main(String[] args) {
		int min = 0;
		int[] array = { 10, 20, -10, 30, 40, 50 };
		
		for(int i=0; i<array.length; i++) {
			if(min == 0) {
				min = array[0];
			} else if(min > array[i]) {
				min = array[i];
			}
			
		}
		System.out.println("min:" + min);
	}
}