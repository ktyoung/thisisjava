package sec07.exam08_abstract_class;

public class SmartPhone extends Phone {
	// ������
	public SmartPhone(String owner) {
		super(owner);
	}
	
	// �޼���
	public void internetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}
}