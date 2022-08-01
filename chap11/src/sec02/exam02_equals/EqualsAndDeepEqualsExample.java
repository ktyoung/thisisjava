package sec02.exam02_equals;

import java.util.Arrays;
import java.util.Objects;

// Objects.equals(Object a, Object b)�� �� ��ü�� ������ ����
// Objects.deepEquals(Object a, Object b) ���� �� ��ü�� ������ ����
// �� a�� b�� ���� �ٸ� �迭�� ���, �׸� ���� ��� ���ٸ� true�� �����Ѵ�. �� Arrays.deepEquals(Object[] a, Object[] b)�� �����ϴ�.
public class EqualsAndDeepEqualsExample {

	public static void main(String[] args) {
		Integer o1 = 1000;
		Integer o2 = 1000;
		System.out.println(Objects.equals(o1, o2));
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, o2));
		System.out.println(Objects.equals(null, null));			// a�� b ��� null�� ��� true�� �����Ѵ�.
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
