package sec09.exam01_array;

public class Member implements Comparable<Member> {
	String name;
	Member(String name) {
		this.name = name;
	}
	
	// Comparable<Member> : Member Ÿ�Ը� ���ϱ� ���� ���׸� <> ���
	// compareTo() : �񱳰��� �����ϵ��� �������̵�
	// ���������� ��, �ڽ��� �Ű������� ���� ��� ����, ���� ��� 0, ���� ��� ����� �����ϸ� �ȴ�.
	// ���������� ��, �ڽ��� �Ű������� ���� ��� ���, ���� ��� 0, ���� ��� ������ �����ϸ� �ȴ�.
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);	// name �ʵ尪���� ���� �� �����ڵ带 ���ؾ� �ϹǷ�, String�� compareTo() ���ϰ��� ���
	}
	
	
}
