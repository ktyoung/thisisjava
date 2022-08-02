package sec05.exam03_method;

// ���ڿ��� ��� �ҹ���, �빮�ڷ� �ٲ� ���ο� ���ڿ��� ������ �� �����ϴ� toLowerCase(), toUpperCase()
// equalsIgnoreCase() �޼��带 ����ϸ� ��ҹ��ڸ� ���ߴ� �۾��� ���� �����ϴ�.
public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String upperStr1 = str1.toUpperCase();
		System.out.println(lowerStr1);
		System.out.println(upperStr1);
		
		String lowerStr2 = str2.toLowerCase();
		String upperStr2 = str2.toUpperCase();
		System.out.println(lowerStr2);
		System.out.println(upperStr2);
		
		System.out.println(lowerStr1.equals(lowerStr2));
		System.out.println(upperStr1.equals(upperStr2));
		
		System.out.println(str1.equalsIgnoreCase(str2));

	}

}
