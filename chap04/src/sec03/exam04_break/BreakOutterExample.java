package sec03.exam04_break;

public class BreakOutterExample {

	public static void main(String[] args) {
		Outter : for(char upper='A'; upper<='Z'; upper++) { // Outter�� �ٱ� for���� �̸�(��)
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break Outter; // Outter ���� ���� for�� ����
				}
			}
		}
		System.out.println("���α׷� ���� ����");
	}

}
