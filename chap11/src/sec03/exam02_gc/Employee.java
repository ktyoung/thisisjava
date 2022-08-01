package sec03.exam02_gc;

public class Employee {
	public int eno;
	
	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Employee(" + eno + ") 가 메모리에 생성됨");
	}
	
	// 쓰레기 수집기가 객체를 삭제하는지 확인하기 위해 객체 소멸자 finalize()를 이용한다.
	// 쓰레기 수집기는 객체를 삭제하기 전에 마지막으로 객체 소멸자를 실행한다.
	public void finalize() { // 소멸자
		System.out.println("Employee(" + eno + ") 가 메모리에서 제거됨");
	}
}
