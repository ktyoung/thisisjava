package sec01.exam05_deep_clone;

import java.util.Arrays;

// ���� ������ ���� : ���� ��ü���� ���� ��ü�� �����ϸ�, ���� ��ü�� ����� ���� ������ �ȴ�.(���� ������ ���� ��ü�� �ʵ�� ���� ��ü�� �ʵ尡 ���� ��ü�� ������)
// ���� ���� : �����ϰ� �ִ� ��ü�� �����Ѵ�.
// ���� ������ �Ϸ��� Object�� clone() �޼��带 �������Ͽ� ���� ��ü�� �����ϴ� �ڵ带 ���� �ۼ��ؾ� �Ѵ�.
public class Member implements Cloneable {
	public String name;
	public int age;
	public int[] scores;	// ���� Ÿ�� �ʵ� (���� ���� ���)
	public Car car;			// ���� Ÿ�� �ʵ� (���� ���� ���)

	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override				// clone() �޼��� ������
	protected Object clone() throws CloneNotSupportedException {
		// ���� ���� ���縦 �ؼ� name, age �ʵ带 �����Ѵ�.
		Member cloned = (Member) super.clone();	// Object�� clone() ȣ��
		// scores�� ���� ����
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		// car ��ü ���� ����
		cloned.car = new Car(this.car.model);
		// ���� ������ Member ��ü ����
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
