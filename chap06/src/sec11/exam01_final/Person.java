package sec11.exam01_final;

public class Person {
	// final : 오직 한 번만 사용될 수 있는 Entity를 정의할 때 사용함 
	// → 초기값이 저장되면 최종적인 값이 되어 프로그램 실행 도중에도 수정을 할 수 없음
	// → static과 달리(static은 객체 하나에 선언) 객체마다 선언이 됨
	
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
