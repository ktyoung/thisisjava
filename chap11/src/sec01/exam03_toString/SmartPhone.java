package sec01.exam03_toString;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	@Override							// �����ϰ� ������ ������ �����ϱ� ���� toString() �޼��� ������
	public String toString() {
		return company + ", " + os;
	}
}
