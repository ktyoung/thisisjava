package sec01.exam04_clone;

// ��ü�� �����ϴ� ���� : ���� ��ü�� �����ϰ� ��ȣ�ϱ� ���ؼ�!
// �� �ŷ����� �ʴ� �������� ���� ��ü�� �Ѱܼ� �۾��� ���, ���� �������� ��ü�� �Ѽյ� �� �ִ�.

// ���� ���� : �ܼ��� �ʵ尪�� �����ؼ� ��ü�� �����ϴ� ��.
// �� �ʵ尪�� �����ϱ� ������ �ʵ尡 �⺻Ÿ���� ��� �� ���簡 �Ͼ��, �ʵ尡 ����Ÿ���� ��� ��ü�� ������ ����ȴ�.
// clone() �޼���� �ڽŰ� ������ �ʵ尪�� ���� ���� ������ ��ü�� �����Ѵ�.
// ���� ��ü�� �ݵ�� java.lang.Cloneable �������̽��� �����ϰ� �־�� �Ѵ�.(������ ����Ѵٴ� �ǵ����� ǥ��)
// Cloneable �������̽��� �������� ������ clone() �޼��带 ȣ���� �� CloneNotSupportedException ���ܰ� �߻��ؼ� ������ �����Ѵ�.

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
		try {							// clone() �޼����� ���� Ÿ���� Object�̹Ƿ� Member Ÿ������ ���� Ÿ�� ��ȯ
			cloned = (Member) clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}

}
