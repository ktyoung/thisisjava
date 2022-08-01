package sec02.exam04_null;

import java.util.Objects;

// Objects.isNull(Object obj) 메서드는 매개값이 null일 경우 true를 리턴
// Objects.NonNull(Object obj) 메서드는 매개값이 not null일 경우 true를 리턴
// Objects.requireNonNull() 메서드는 아래 3가지로 오버로딩 되어있다.
// 1. requireNonNull(T obj), 2. requireNonNull(T obj, String message), 3. requireNonNull(T obj, Supplier<String> msgSupplier) 
public class NullExample {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(Objects.requireNonNull(str1));
		try {
			String name = Objects.requireNonNull(str2, "이름이 없습니다.");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			String name = Objects.requireNonNull(str2, ()->"이름이 없다니까요.");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
