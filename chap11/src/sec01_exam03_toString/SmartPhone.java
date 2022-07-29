package sec01_exam03_toString;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	@Override							// 간결하고 유익한 정보를 리턴하기 위해 toString() 메서드 재정의
	public String toString() {
		return company + ", " + os;
	}
}
