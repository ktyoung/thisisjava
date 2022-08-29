package sec03.exam01_no_arguments_no_return;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		// �Ű������� ���� ���ٽ� �ۼ��ϱ�
		fi = () -> {
			String str = "method call 1";
			System.out.println(str);
		};
		// ���ٽ� �����ϱ�
		fi.method();
		
		fi = () -> { System.out.println("method call 2"); };
		fi.method();
		
		fi = () -> System.out.println("method call 3");
		fi.method();
	}

}
