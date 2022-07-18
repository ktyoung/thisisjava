package sec07.exam08_abstract_class;

// 추상 클래스는 클래스의 공통적인 부분(변수, 메서드)을 추출해서 선언한 클래스
// 추상 클래스는 객체를 만들 수 없다 → 실체성이 없고 구체적이지 않기 때문
// 추상 클래스와 실체 클래스는 상속 관계

public class PhoneExample {

	public static void main(String[] args) {
		// Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
	}

}
