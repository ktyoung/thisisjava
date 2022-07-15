package sec07.exam06_casting;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		부모 클래스에 존재하지 않는 필드와 메서드이므로 실행 불가
		parent.field2 = "data2";
		parent.method3();
		*/
		
		// 자식 객체 선언
		Child child = (Child) parent;	// 부모의 객체를 자식의 객체로 강제 형변환(Casting)함 → 자식의 메서드와 필드 사용 가능
		child.field2 = "yyy";
		child.method3();

	}

}
