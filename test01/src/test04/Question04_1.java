package test04;

public class Question04_1 {

	public static void main(String[] args) {
	    int max = 0;
	    int[] array = { 1, 5, 3, 10, 8, 2 };
	    for(int i=0; i<array.length; i++) {
		if(max < array[i]) {
			max = array[i];
		}
	    }
	    System.out.println("max: " + max);
	}
}
