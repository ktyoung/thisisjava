package sec09.exam01_array;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		char[] arr1 = { 'J', 'A', 'V', 'A' };
		
		// ��� 1. arr1 ��ü�� arr2�� ����
		// copyOf(�����迭, ������ ����)
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
		
	}

}
