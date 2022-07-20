package test09;

public class Child extends Parent {
	private String name;
	
	public Child() {
		// super();			// 원래는 super();가 생성되어야 하나, super와 this는 함께 사용할 수 없음 → super();가 생성되지 않음
		this("홍길동");		// (1) 인자가 하나인 아래 Child(String name) 메서드가 실행됨
		// this는 클래스 이름을 의미함 → Child()와 Child(String name) 2가지를 의미하게 됨
		System.out.println("Child() call");				// (8) 실행
	}
	
	public Child(String name) {	// 매개변수가 하나인 생성자는 super();를 호출
		super();			// (2) Parent 클래스의 Parent 메서드를 가리킴
		this.name = name;	// 필드에 속한 this이므로~ Child(String name)를 의미함  
		System.out.println("Child(String name) call");	// (7) 실행
	}
}
