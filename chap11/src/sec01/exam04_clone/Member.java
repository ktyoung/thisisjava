package sec01.exam04_clone;

// 객체를 복제하는 이유 : 원본 객체를 안전하게 보호하기 위해서!
// → 신뢰하지 않는 영역으로 원본 객체를 넘겨서 작업할 경우, 원본 데이터의 객체가 훼손될 수 있다.

// 얕은 복제 : 단순히 필드값을 복사해서 객체를 복사하는 것.
// → 필드값만 복사하기 때문에 필드가 기본타입일 경우 값 복사가 일어나고, 필드가 참조타입일 경우 객체의 번지가 복사된다.
// clone() 메서드는 자신과 동일한 필드값을 가진 얕은 복제된 객체를 리턴한다.
// 원본 객체는 반드시 java.lang.Cloneable 인터페이스를 구현하고 있어야 한다.(복제를 허용한다는 의도적인 표시)
// Cloneable 인터페이스를 구현하지 않으면 clone() 메서드를 호출할 때 CloneNotSupportedException 예외가 발생해서 복제에 실패한다.

public class Member implements Cloneable {
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public Member (String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {							// clone() 메서드의 리턴 타입은 Object이므로 Member 타입으로 강제 타입 변환
			cloned = (Member) clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}

}
