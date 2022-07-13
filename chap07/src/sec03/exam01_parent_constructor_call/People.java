package sec03.exam01_parent_constructor_call;

public class People {
	// 부모 클래스
	
	public String name;
	public String ssn;
	
	// 부모 클래스 생성자 명시 (기본 생성자 X)
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}