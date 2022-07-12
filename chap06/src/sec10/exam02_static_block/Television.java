package sec10.exam02_static_block;

public class Television {
	// static은 값이 하나로 고정되어 있으므로 객체의 영향을 받지 않음
	// static block 안에 필드와 메서드가 선언되어서는 안 됨
	// 고유한 하나의 값을 가지지 않는 변수가 사용되면 컴파일 에러
	
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	// 아래와 동일하게 동작하는 코드
	// static String info = company + "-" + model
	
	// static block
	static {
		info = company + "-" + model;
	}
}
