package sec09.exam01_array;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		char[] arr1 = { 'J', 'A', 'V', 'A' };
		
		// 방법 1. arr1 전체를 arr2로 복사
		// copyOf(원본배열, 복사할 길이)
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
		
		// 방법 2. arr1[1] ~ arr1[2]를 arr3[0] ~ arr[1]로 복사
		// copyOfRange(원본배열, 시작인덱스, 끝인덱스)
		char[] arr3= Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr3));
		
		// 방법3. arr1 전체를 arr4로 복사
		// 단순 배열 복사 목적이라면 System.arraycopy() 메서드 사용 → 5개의 매개값 필요
		// System.arraycopy(원본배열, 원본시작인덱스(복사할 항목의 시작 위치), 
		// 					타겟배열, 타겟시작인덱스(타겟배열에서의 복사 시작 위치), 복사 개수(원본 시작 인덱스에서 몇 개의 항목을 복사할 것인지?))
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		for(int i=0; i<arr4.length; i++) {
			System.out.println("arr4[" + i + "] = " + arr4[i]);
		}
	
	}
}