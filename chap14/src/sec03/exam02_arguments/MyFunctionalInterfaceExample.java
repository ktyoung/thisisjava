package sec03.exam02_arguments;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		// 매개변수가 있는 람다식 작성하기
		fi = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		// 람다식 실행하기
		fi.method(5);
		
		fi = (x) -> { System.out.println(x*5); };
		fi.method(5);
		
		fi = (x) -> System.out.println(x*5);
		fi.method(5);
	}

}