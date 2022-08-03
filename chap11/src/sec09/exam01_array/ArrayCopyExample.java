package sec09.exam01_array;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		char[] arr1 = { 'J', 'A', 'V', 'A' };
		
		// 방법 1. arr1 전체를 arr2로 복사
		// copyOf(원본배열, 복사할 길이)
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
		
	}

}
