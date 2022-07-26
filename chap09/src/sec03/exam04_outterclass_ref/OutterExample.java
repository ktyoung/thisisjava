package sec03.exam04_outterclass_ref;

public class OutterExample {

	public static void main(String[] args) {
		Outter outter = new Outter();					// 바깥 클래스 객체 생성
		Outter.Nested nested = outter.new Nested();		// 안쪽 클래스 객체 생성

		nested.print();
	}

}
