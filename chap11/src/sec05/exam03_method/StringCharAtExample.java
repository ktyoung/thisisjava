package sec05.exam03_method;

public class StringCharAtExample {

	public static void main(String[] args) {
		String ssn = "123456-1234567";
		char sex = ssn.charAt(7);
			switch(sex) {
			case '1':
			case '3':
				System.out.println("�����Դϴ�.");
				break;
			
			case '2':
			case '4':
				System.out.println("�����Դϴ�.");
				break;
				}
	}

}
