package sec10.exam04_singleton;

public class SingletonExample {

	public static void main(String[] args) {
		// 생성할 수는 없고 사용할 수만 있는 Singleton → 외부에서 객체를 만드는 것을 허용하지 않음.
		
		// Singleton obj1 = new Singleton(); // 컴파일 에러
		// Singleton obj2 = new Singleton(); // 컴파일 에러
		
		// 인스턴스를 생성하는 getInstance 메서드 → new와 다르게 최초 할당된 메모리 주소를 계속 사용함
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}

	}

}
