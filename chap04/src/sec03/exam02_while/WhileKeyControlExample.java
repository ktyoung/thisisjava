package sec03.exam02_while;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode != 13 && keyCode != 10) { // ����Ű�� �Է��ص� ��ȭ�� ���Բ�
				System.out.println("-------------------");
				System.out.println("1.���� | 2.���� | 3.����");
				System.out.println("-------------------");
				System.out.println("���� : ");
			}
			keyCode = System.in.read();	// ���� �� ���ھ� �Է¹���
										// 11111�� �Է��ϸ� 5��ŭ �� ���� ������
			
			if(keyCode == 49) { // 1�� �����ڵ�
				speed++;
				System.out.println("���� �ӵ� = " + speed);
			} else if (keyCode == 50) { // 2�� �����ڵ�
				speed--;
				System.out.println("���� �ӵ� = " + speed);
			} else if (keyCode == 51) { // 3�� �����ڵ�
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}

}
