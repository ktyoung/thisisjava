package sec03.exam05_getenv;

// 자바 프로그램에서는 환경 변수의 값이 필요한 경우, System.getenv() 메서드를 사용한다.
// 매개값으로 환경 변수 이름을 주면 값을 리턴한다.
public class SystemEnvExample {

	public static void main(String[] args) {
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("[ JAVA_HOME ] " + javaHome);

	}

}
