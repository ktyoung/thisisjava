package sec03.exam03_dowhile;

import java.util.Scanner; // Ctrl + Shift + O ������ �ڵ� ����

public class DoWhileExample {

	public static void main(String[] args) {
		System.out.println("�޽����� �Է��ϼ���.");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");
		
		Scanner scanner = new Scanner(System.in); // ��������(����)���� �ν��ؼ� �޾Ƶ���
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scanner.nextLine(); // �ٹٲ�
			System.out.println(inputString);
		} while( ! inputString.equals("q") ); 	// ������ ���̸� �ݺ�, �����̸� ����
												// q�� �ԷµǸ� false�� �� - ����
		
		System.out.println();
		System.out.println("���α׷� ����");
	}

}
