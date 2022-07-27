package sec02_runtime_exception;

public class ArrayIndexOutOfBoundsExeptionExample {
	// 배열에서 인덱스 범위를 초과해서 사용할 경우 발생
	// 예를 들어, 길이가 3인 int[] = new int[3]; 배열을 선언했을 때, 배열 항목을 지정하기 위해 arr[0]~arr[2]까지 사용할 수 있다.
	// 하지만 arr[3] 사용 시 인덱스 범위를 초과하기 때문에 예외가 발생한다.
	
	public static void main(String[] args) {
		if(args.length == 2) {	
			String data1 = args[0];		// 실행 매개값 args 배열을 매개 값으로 넘겨주지 않았기 때문에 args[0], args[1]과 같이 인덱스를 사용할 수 없다.
			String data2 = args[1];		// 따라서 배열 값을 읽기 전에 배열의 길이를 먼저 조사하여 예외 발생을 사전에 방지해야 한다.
										// 실행 매개값이 없거나 부족할 경우, 조건문을 이용해서 사용자에게 실행 방법을 알린다.
			System.out.println("args[0] : " + data1);
			System.out.println("args[1] : " + data2);
		} else {
			System.out.println("[실행 방법]");
			System.out.println("ArrayIndexOutOfBoundsExeptionExample");
			System.out.println("값1    값2");
		}

	}

}