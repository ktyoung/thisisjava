package sec03.exam04_break;

public class BreakExample {

	public static void main(String[] args) throws Exception {
		while(true) { // ���ѹݺ�
			int num = (int)(Math.random()*6) + 1; // ������ �����ϰ� ������
			System.out.println(num);
			if(num == 6) { 
				break; // ���� �� 6�� �����Ǹ� ���α׷� ����
			}
		}
		System.out.println("���α׷� ����");

	}

}
