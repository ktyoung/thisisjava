package sec04.exam01_class;

// getClass() 메서드는 해당 클래스로 객체를 생성했을 때만 사용할 수 있음.
// Class는 생성자를 감추고 있기 때문에 new 연산자로 객체를 생성할 수 없고, 정적 메서드인 forName()을 이용해야 한다.
public class ClassExample {

	public static void main(String[] args) {
		Car car = new Car();
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
		
		// Class.forName() 메서드는 매개값으로 주어진 클래스를 찾지 못하면 ClassNotFoundException 예외를 발생시킴
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
