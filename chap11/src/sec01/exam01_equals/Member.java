package sec01.exam01_equals;

// ��ü�� equals : �Ű� Ÿ�� �� Object�� ��� ��ü�� �Ű������� ���Ե� �� �ִ�. ���� Ÿ�� �� boolean (�� ������ == �� ������ ��� ����)
// �������� �����ϴٴ� �ǹ� : ���� ��ü�̰� �ٸ� ��ü�̰� ������� �����ϰ� �ִ� �����Ͱ� ������.
// equals �޼���� ���� ������ �ʰ� ���� Ŭ�������� �������Ͽ� �������� ���� �� �� �̿�ȴ�.
public class Member {
	// �ʵ�
	public String id;
	
	// ������
	public Member(String id) {
		this.id = id;
	}
	
	// equals �޼��带 �������� ��, �Ű���(�񱳰�ü)�� ���� ��ü�� ������ Ÿ���� ��ü���� ���� Ȯ��(insteadof �����ڷ�)
	// ���� �� ��ü�� �ٸ� Ÿ���̶�� equals �޼���� false�� �����ؾ� �Ѵ�.
	// �� ��ü�� ������ Ÿ���̶�� ���� ��ü Ÿ������ ���� Ÿ�� ��ȯ�ؼ� �ʵ� ���� �������� �˻��Ѵ�.
	
	@Override								// Object�� equals() �޼��� �������̵� 
	public boolean equals(Object obj) {
		if(obj instanceof Member) {			// �Ű��� obj�� Member Ÿ������ Ȯ��
			Member member = (Member) obj;	// Member Ÿ������ ���� Ÿ�� ��ȯ
			if(id.equals(member.id)) {		// id �ʵ� ���� �������� �˻�, �����ϸ� true ����
				return true;
			} 
		}
		return false;						// �Ű��� obj�� Member Ÿ���� �ƴϰų� id �ʵ� ���� �ٸ��� false ����
	}
}
