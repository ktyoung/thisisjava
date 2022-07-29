package sec01.exam05_deep_clone;

import java.util.Arrays;

// 얕은 복제의 단점 : 복제 객체에서 참조 객체를 변경하면, 원본 객체도 변경된 값을 가지게 된다.(얕은 복제는 원본 객체의 필드와 복제 객체의 필드가 같은 객체를 참조함)
// 깊은 복제 : 참조하고 있는 객체도 복제한다.
// 깊은 복제를 하려면 Object의 clone() 메서드를 재정의하여 참조 객체를 복제하는 코드를 직접 작성해야 한다.
public class Member implements Cloneable {
	public String name;
	public int age;
	public int[] scores;	// 참조 타입 필드 (깊은 복제 대상)
	public Car car;			// 참조 타입 필드 (깊은 복제 대상)

	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override				// clone() 메서드 재정의
	protected Object clone() throws CloneNotSupportedException {
		// 먼저 얕은 복사를 해서 name, age 필드를 복제한다.
		Member cloned = (Member) super.clone();	// Object의 clone() 호출
		// scores를 깊은 복제
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		// car 객체 깊은 복제
		cloned.car = new Car(this.car.model);
		// 깊은 복제된 Member 객체 리턴
		return cloned;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
}
