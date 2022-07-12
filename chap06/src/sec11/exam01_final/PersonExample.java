package sec11.exam01_final;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		// p1.nation = "usa";			// final형으로 선언된 변수는 수정할 수 없음 → 컴파일 에러
		// p1.ssn = "654321-7654321";	// final형으로 선언된 변수는 수정할 수 없음 → 컴파일 에러
		p1.name = "을지문덕";

	}

}
