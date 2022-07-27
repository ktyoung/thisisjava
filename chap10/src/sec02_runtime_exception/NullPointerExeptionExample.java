package sec02_runtime_exception;

public class NullPointerExeptionExample {

	public static void main(String[] args) {
		String data = null;
		System.out.println(data.toString());	// 예외 발생
		
		// data 변수는 null 값을 가지기 때문에 String 객체를 참조하고 있지 않다.
		// data.toString()에서 String 객체의 toString() 메소드를 호출 시 NullPointerExeption이 발생한다.
	}

}
