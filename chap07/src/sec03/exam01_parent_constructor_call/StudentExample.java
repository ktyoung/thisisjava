package sec03.exam01_parent_constructor_call;

public class StudentExample {
	// 자식 객체 이용
	
	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-12345467", 1);
		System.out.println("name : " + student.name);	// 부모에게 상속받은 필드 출력
		System.out.println("ssn : " + student.ssn);		// 부모에게 상속받은 필드 출력
		System.out.println("studentNo : " + student.studentNo);

	}

}
