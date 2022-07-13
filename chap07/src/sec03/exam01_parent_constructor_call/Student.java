package sec03.exam01_parent_constructor_call;

public class Student extends People {
	// 자식 클래스
	
	public int studentNo;
	
	// 부모 클래스에 기본 생성자가 없고 매개변수만 있는 생성자만 있다면
	// 자식 클래스에서 반드시 부모 생성자 호출을 위해 super(매개값1, ...)를 명시적으로 호출해야 한다.
	// super는 반드시 자식 생성자 첫 줄에 위치해야 한다.
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); // 부모 생성자 호출
		this.studentNo = studentNo;
	}
}
