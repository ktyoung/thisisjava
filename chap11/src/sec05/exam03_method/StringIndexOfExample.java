package sec05.exam03_method;

// �Ű������� �־��� ���ڿ��� ���۵Ǵ� �ε����� �����ϴ� indexOf()
// �־��� ���ڿ��� ���ԵǾ� ���� ������ -1�� ����
public class StringIndexOfExample {

	public static void main(String[] args) {
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���");
		System.out.println(location);
		
		if(subject.indexOf("�ڹ�") != -1) {
			System.out.println("�ڹٿ� ���õ� å�̱���.");
		} else {
			System.out.println("�ڹٿ� ���þ��� å�̱���.");
		}

	}

}
