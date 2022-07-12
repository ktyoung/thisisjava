package sec10.exam04_singleton;

public class Singleton {
	// Singleton : 객체를 하나만 선언할 수 있음
	// public : 외부에서 접근 가능(다른 클래스에서도 사용 가능)
	// private : 외부에서 접근 금지(같은 클래스에서만 사용 가능)
	
	private static Singleton singLeton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return singLeton;
	}
}
