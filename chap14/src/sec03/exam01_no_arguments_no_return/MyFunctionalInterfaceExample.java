package sec03.exam01_no_arguments_no_return;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		// 매개변수가 없는 람다식 작성하기
		fi = () -> {
			String str = "method call 1";
			System.out.println(str);
		};
		// 람다식 실행하기
		fi.method();
		
		fi = () -> { System.out.println("method call 2"); };
		fi.method();
		
		fi = () -> System.out.println("method call 3");
		fi.method();
	}

}
