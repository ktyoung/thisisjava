package sec02.exam01_objects;

import java.util.Comparator;
import java.util.Objects;

// compare(T a, T b, Comparator<T> c) : 객체 비교 메서드
// 두 객체 a, b를 비교자(Comparator)로 비교해서 int 값을 리턴한다.
// 두 객체를 비교하는 Compare(T a, T b) 메서드가 정의되어 있다. → T == 비교할 객체 타입
// 리턴 타입 : int
// → a가 b 보다 작으면 음수(-1), a와 b가 같으면 0, a가 b보다 크면 양수(1)를 리턴하도록 구현 클래스를 만들어야 한다.
public class CompareExample {

	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);

		int result1 = Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result1);
		int result2 = Objects.compare(s1, s3, new StudentComparator());
		System.out.println(result2);
	}
	
	static class Student {
		int sno;
		Student(int sno) {
			this.sno = sno;
		}
	}
	
	static class StudentComparator implements Comparator<Student> {

		@Override
		public int compare(Student a, Student b) {
			if(a.sno < b.sno) { return -1; }
			else if(a.sno == b.sno) { return 0; }
			else return 1;
			
			// return Integer.compare(a.sno, b.sno); // → 위 if문과 같은 기능
		}
		
	}

}