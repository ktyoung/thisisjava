package sec10.exam01_wrapper;

// 자동 Boxing은 포장 클래스 타입에 기본 값이 대입될 경우 발생
// 자동 Unboxing은 기본 타입에 포장 객체가 대입될 경우 발생
public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// Boxing
		Integer obj = 100;
		System.out.println("value : " + obj.intValue());
		
		// 대입 시 Unboxing
		int value = obj;
		System.out.println("value : " + value);
		
		// 연산 시 자동 Unboxing
		int result = obj + 100;
		System.out.println("result : " + result);
	}

}
