package sec05.exam03_method;

// �޼��忡 �־��� �ε������� ���ڿ��� �����ϴ� substring()
public class StringSubstringExample {

	public static void main(String[] args) {
		String ssn = "123456-1234567";
		
		String firstNum = ssn.substring(0, 6);	// �־��� ���۰� �� �ε��� ������ ���ڿ� ����
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);	// �־��� �ε��� ���ĺ��� ������ ���ڿ� ����
		System.out.println(secondNum);
	}

}
