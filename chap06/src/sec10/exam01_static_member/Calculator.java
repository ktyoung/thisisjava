package sec10.exam01_static_member;

public class Calculator {
	// static : 정적, 고정된 값, 고정된 하나의 값만 가짐, 최상위 변수, 값을 변경하면 변수가 사용된 모든 객체에 영향을 줌
	static double pi = 3.14159;
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
}
