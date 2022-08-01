package sec02.exam03_hashcode;

import java.util.Objects;

// Objects.hash(Object ... values) �޼���� �Ű������� �־��� ������ �̿��ؼ� �ؽ��ڵ带 �����ϴ� ������ �Ѵ�.
// Objects.hashCode(Object o) �޼���� �Ű������� �־��� ��ü�� �ؽ��ڵ带 �����ϱ� ������ o.hashCode()�� ���ϰ��� �����ϴ�.
// �������� �Ű����� null �̸� 0�� �����Ѵ�
public class HashCodeExample {

	public static void main(String[] args) {
		Student s1 = new Student(1, "ȫ�浿");
		Student s2 = new Student(1, "ȫ�浿");
		// ������ �ʵ� ���� ������ ��ü�� ������ �ؽ��ڵ带 ���� �� �ִ�.
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
