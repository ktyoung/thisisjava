package sec07.exam02_field_initialize;

public class Korean {

	// 필드
	String nation = "대한민국";
	String name; // 생성자를 통해 필드 값을 생성함
	String ssn;
	
	// 생성자
	
	// 아래와 동일하게 동작하는 코드
	/*	
		public Korean(String n, String s) {
		name = n;
		ssn = s;
	}	
	*/

	public Korean(String name, String ssn) {
		this.name = name; // this : 그때그때 입력되는 값을 저장함 → 바깥 name(객체)을 인자로 받아  필드 name에 저장함
		this.ssn = ssn;
	}
}