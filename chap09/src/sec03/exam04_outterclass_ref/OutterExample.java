package sec03.exam04_outterclass_ref;

public class OutterExample {

	public static void main(String[] args) {
		Outter outter = new Outter();					// �ٱ� Ŭ���� ��ü ����
		Outter.Nested nested = outter.new Nested();		// ���� Ŭ���� ��ü ����

		nested.print();
	}

}
