package test09;

public class Member {
	private String id;
	private String name;
    
	public Member(String id, String name) {
    	this.id = id;
    	this.name = name;
	}
    
	// "toString()" �޼���� ��ü�� ������ �ִ� ������ ������ ���ڿ��� ����� �����ϴ� �޼���
    @Override
    public String toString() {
    	return id + " : " + name;
    }
}