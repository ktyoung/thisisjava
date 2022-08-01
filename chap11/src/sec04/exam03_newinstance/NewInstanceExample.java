package sec04.exam03_newinstance;

// 동적 객체 생성 newInstance()
// 클래스 객체를 이용하면 new 연산자를 사용하지 않아도 동적으로 객체를 생성할 수 있다.
// 이 방법은 코드 작성 시에 클래스 이름을 결정할 수 없고, 런타임 시에 클래스 이름이 결정되는 경우에 유용하게 사용된다.
// newInstance() 메서드는 기본 생성자를 호출하여 객체를 생성하기 때문에 반드시 클래스에 기본 생성자가 존재해야 한다.
public class NewInstanceExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("sec04.exam03_newinstance.SendAction");
			// Class clazz = Class.forName("sec04.exam03_newinstance.ReceiveAction");
			Action action = (Action) clazz.newInstance();
			action.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

	}

}
