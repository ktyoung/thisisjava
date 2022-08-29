package sec03.exam03_return;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		// 리턴값이 있는 람다식 작성하기
		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		// 람다식 실행하기
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> { return x + y; };
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> x + y;
		System.out.println(fi.method(2, 5));
		
		// 람다식과 사용자 정의 함수를 함께 사용하기
		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method(2, 5));
		
	}
	public static int sum(int x, int y) {
		return (x + y);
	}
}