package sec05.exam03_method;

// ù ��° �Ű����� ���ڿ��� ã�� �� ��° �Ű����� ���ڿ��� ��ġ�� ���ο� ���ڿ��� �����ϰ� �����Ѵ�.
public class StringReplaceExample {

	public static void main(String[] args) {
		String oldStr = "�ڹٴ� ��ü�������Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		String newStr = oldStr.replace("�ڹ�", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);

	}

}
