package sec10.exam01_wrapper;

// 포장 객체는 내부의 값을 비교하기 위해 == 연산자와 != 연산자를 사용할 수 없다.
// 해당 연산자들은 내부의 값을 비교하는 것이 아니라, 포장 객체의 참조(번지값)를 비교하기 때문.
// 즉, 내부의 값을 비교하려면 언박싱한 값을 얻어내어 비교해야 한다.
// 따라서, 직접 내부 값을 언박싱해서 비교하거나, equals() 메서드로 내부 값을 비교하는 것이 좋다.
public class ValueCompareExample {

	public static void main(String[] args) {
		System.out.println("[-128~127 초과값일 경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==결과 : " + (obj1==obj2));	// false
		System.out.println("언박싱 후 == 결과 : " + (obj1.intValue() == obj2.intValue()));
		
		System.out.println("[-128~127 초과값일 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==결과 : " + (obj3==obj4));
		System.out.println("언박싱 후 == 결과 : " + (obj3.intValue() == obj4.intValue()));
	}

}
