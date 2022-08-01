package sec04.exam01_class;

// getClass() �޼���� �ش� Ŭ������ ��ü�� �������� ���� ����� �� ����.
// Class�� �����ڸ� ���߰� �ֱ� ������ new �����ڷ� ��ü�� ������ �� ����, ���� �޼����� forName()�� �̿��ؾ� �Ѵ�.
public class ClassExample {

	public static void main(String[] args) {
		Car car = new Car();
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
		
		// Class.forName() �޼���� �Ű������� �־��� Ŭ������ ã�� ���ϸ� ClassNotFoundException ���ܸ� �߻���Ŵ
		try {
			Class clazz2 = Class.forName("sec04.exam01_class.Car");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
