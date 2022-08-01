package sec02.exam02_equals;

import java.util.Arrays;
import java.util.Objects;

// Objects.equals(Object a, Object b)는 두 객체의 동등을 비교함
// Objects.deepEquals(Object a, Object b) 역시 두 객체의 동등을 비교함
// → a와 b가 서로 다른 배열일 경우, 항목 값이 모두 같다면 true를 리턴한다. → Arrays.deepEquals(Object[] a, Object[] b)와 동일하다.
public class EqualsAndDeepEqualsExample {

	public static void main(String[] args) {
		Integer o1 = 1000;
		Integer o2 = 1000;
		System.out.println(Objects.equals(o1, o2));
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, o2));
		System.out.println(Objects.equals(null, null));			// a와 b 모두 null일 경우 true를 리턴한다.
		System.out.println(Objects.deepEquals(o1, o2) + "\n");
		
		Integer[] arr1 = { 1, 2 };
		Integer[] arr2 = { 1, 2 };
		System.out.println(Objects.equals(arr1, arr2));
		System.out.println(Objects.deepEquals(arr1, arr2));
		System.out.println(Arrays.deepEquals(arr1, arr2));
		System.out.println(Objects.deepEquals(null, arr2));
		System.out.println(Objects.deepEquals(arr1, null));
		System.out.println(Objects.deepEquals(null, null));
	}

}
