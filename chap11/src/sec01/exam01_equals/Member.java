package sec01_exam01_equals;

// 객체비교 equals : 매개 타입 → Object로 모든 객체가 매개값으로 대입될 수 있다. 리턴 타입 → boolean (비교 연산자 == 와 동일한 결과 리턴)
// 논리적으로 동등하다는 의미 : 같은 객체이건 다른 객체이건 상관없이 저장하고 있는 데이터가 동일함.
// equals 메서드는 직접 사용되지 않고 하위 클래스에서 재정의하여 논리적으로 동등 비교 시 이용된다.
public class Member {
	// 필드
	public String id;
	
	// 생성자
	public Member(String id) {
		this.id = id;
	}
	
	// equals 메서드를 재정의할 시, 매개값(비교객체)이 기준 객체와 동일한 타입의 객체인지 먼저 확인(insteadof 연산자로)
	// 만약 비교 객체가 다른 타입이라면 equals 메서드는 false를 리턴해야 한다.
	// 비교 객체가 동일한 타입이라면 기준 객체 타입으로 강제 타입 변환해서 필드 값이 동일한지 검사한다.
	
	@Override								// Object의 equals() 메서드 오버라이딩 
	public boolean equals(Object obj) {
		if(obj instanceof Member) {			// 매개값 obj가 Member 타입인지 확인
			Member member = (Member) obj;	// Member 타입으로 강제 타입 변환
			if(id.equals(member.id)) {		// id 필드 값이 동일한지 검사, 동일하면 true 리턴
				return true;
			} 
		}
		return false;						// 매개값 obj가 Member 타입이 아니거나 id 필드 값이 다르면 false 리턴
	}
}
