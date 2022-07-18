package sec07.exam07_instanceof;

// 객체 타입을 확인하는 instanceof 연산자
// 형변환 가능 여부를 확인하며 true / false로 결과를 반환
// 주로 상속 관계에서 부모객체인지 자식객체인지 확인하는데 사용 
// 사용형식은 '객체 + instanceof + 클래스'

public class InstanceofExample {
	public static void method1(Parent parent) {
		// Child 타입으로 형변환이 가능한지 확인
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	
	/*
	 	public static void method2(Parent parent) {
		// 형변환 되지 않음
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	*/

	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);

	}

}
