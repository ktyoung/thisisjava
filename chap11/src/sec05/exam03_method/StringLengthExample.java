package sec05.exam03_method;

// ���ڿ��� ���̸� �����ϴ� length()
public class StringLengthExample {

	public static void main(String[] args) {
		String ssn = "1234561234567";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("�ֹι�ȣ �ڸ����� �½��ϴ�.");
		} else {
			System.out.println("�ֹι�ȣ �ڸ����� Ʋ���ϴ�.");
		}

	}

}
