package sec02.exam04_null;

import java.util.Objects;

// Objects.isNull(Object obj) �޼���� �Ű����� null�� ��� true�� ����
// Objects.NonNull(Object obj) �޼���� �Ű����� not null�� ��� true�� ����
// Objects.requireNonNull() �޼���� �Ʒ� 3������ �����ε� �Ǿ��ִ�.
// 1. requireNonNull(T obj), 2. requireNonNull(T obj, String message), 3. requireNonNull(T obj, Supplier<String> msgSupplier) 
public class NullExample {

	public static void main(String[] args) {
		String str1 = "ȫ�浿";
		String str2 = null;
		
		System.out.println(Objects.requireNonNull(str1));
		try {
			String name = Objects.requireNonNull(str2, "�̸��� �����ϴ�.");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			String name = Objects.requireNonNull(str2, ()->"�̸��� ���ٴϱ��.");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
