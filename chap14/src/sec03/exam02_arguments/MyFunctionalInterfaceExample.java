package sec03.exam02_arguments;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		// �Ű������� �ִ� ���ٽ� �ۼ��ϱ�
		fi = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		// ���ٽ� �����ϱ�
		fi.method(5);
		
		fi = (x) -> { System.out.println(x*5); };
		fi.method(5);
		
		fi = (x) -> System.out.println(x*5);
		fi.method(5);
	}

}