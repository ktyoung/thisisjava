package sec09.exam01_array;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		char[] arr1 = { 'J', 'A', 'V', 'A' };
		
		// ��� 1. arr1 ��ü�� arr2�� ����
		// copyOf(�����迭, ������ ����)
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
		
		// ��� 2. arr1[1] ~ arr1[2]�� arr3[0] ~ arr[1]�� ����
		// copyOfRange(�����迭, �����ε���, ���ε���)
		char[] arr3= Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr3));
		
		// ���3. arr1 ��ü�� arr4�� ����
		// �ܼ� �迭 ���� �����̶�� System.arraycopy() �޼��� ��� �� 5���� �Ű��� �ʿ�
		// System.arraycopy(�����迭, ���������ε���(������ �׸��� ���� ��ġ), 
		// 					Ÿ�ٹ迭, Ÿ�ٽ����ε���(Ÿ�ٹ迭������ ���� ���� ��ġ), ���� ����(���� ���� �ε������� �� ���� �׸��� ������ ������?))
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		for(int i=0; i<arr4.length; i++) {
			System.out.println("arr4[" + i + "] = " + arr4[i]);
		}
	
	}
}