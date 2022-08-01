package sec02.exam03_hashcode;

import java.util.Objects;

// Objects.hash(Object ... values) 메서드는 매개값으로 주어진 값들을 이용해서 해시코드를 생성하는 역할을 한다.
// Objects.hashCode(Object o) 메서드는 매개값으로 주어진 객체의 해시코드를 리턴하기 때문에 o.hashCode()의 리턴값과 동일하다.
// 차이점은 매개값이 null 이면 0을 리턴한다
public class HashCodeExample {

	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		// 동일한 필드 값을 가지는 객체는 동일한 해시코드를 가질 수 있다.
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));
	}
	
	static class Student {
		int sno;
		String name;
		Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}
		@Override
		public int hashCode() {
			return Objects.hash(sno, name);
		}
	}

}
