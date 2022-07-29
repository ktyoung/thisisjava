package sec01_exam02_hashcode;

// hashCode() 메서드는 객체의 메모리 번지를 이용해서 해시코드를 만들어 리턴한다. 따라서 객체마다 다른 값을 가지고 있다.
// 객체 해시코드 : 객체를 식별할 하나의 정수값
public class Key {
	// 필드
	public int number;
	
	// 생성자
	public Key(int number) {
		this.number = number;
	}
	
	// hashCode() 메서드를 실행해서 리턴된 해시코드 값이 같은지 검사한다.
	// 해시코드 값이 다르면 다른 객체로 판단하고, 같으면 equals() 메서드로 다시 검사한다.
	// 따라서, hashCode() 메서드가 true가 나와도, equals()의 리턴값이 다르면 다른 객체가 된다.
	// → 이런 경우, HashMap의 식별키로 Key 객체를 사용하면 저장된 값을 찾아올 수 있다.
	
	// 결론적으로, 객체의 동등 비교를 위해서는 Object의 equals() 메서드만 재정의하지 말고 hashCode() 메서드도 재정의하여
	// 논리적 동등 객체일 경우 동일한 해시코드가 리턴되도록 해야한다.
	
	@Override											// Object의 equals() 재정의
	public boolean equals(Object obj) {
		if(obj instanceof Key) {						// Key 타입과 같다면 
			Key compareKey = (Key) obj;					// 강제 타입 변환
			if(this.number == compareKey.number) {		// number 필드 값이 같으면 true
				return true;
			}
		}
		return false;
	}
	
	// 의도한대로 "홍길동"을 읽으려면 재정의한 hashCode() 메서드를 Key 클래스에 추가한다. 
	@Override											// hashCode() 재정의
	public int hashCode() {
		return number;
	}
}
