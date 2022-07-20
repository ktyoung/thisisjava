package test09;

public class Parent {
	public String nation;
	
	public Parent() {
		this("대한민국");			// (3) Parent()와 Parent(String nation) 2가지를 의미하게 됨
								// → 인자가 하나인 아래 Parent(String nation) 메서드가 실행됨
		
		System.out.println("Parent() call");	// // (6) 실행
	}
	
	public Parent(String nation) {
		this.nation = nation;	// (4) Parent(String nation) 메서드를 의미함
		System.out.println("Parent(String nation) call");	// (5) 실행
	}
}
