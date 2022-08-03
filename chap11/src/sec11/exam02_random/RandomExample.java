package sec11.exam02_random;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// ���� ��ȣ
		int[] selectNumber = new int[6];	// ���� ��ȣ 6���� ����� �迭
		Random random = new Random(/*3*/);		// ���� ��ȣ�� ��� ���� Random ��ü ����, Random(�õ尪) �� �õ尪�� ������ ���� ���� ����
		System.out.print("���� ��ȣ : ");
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;	// ���� ��ȣ�� ��� �迭�� ���� 
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		// ��÷ ��ȣ
		int[] winningNumber = new int[6];
		random = new Random(/*5*/);
		System.out.print("��÷ ��ȣ : ");
		for(int i=0; i<6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;	// ���� ��ȣ�� ��� �迭�� ���� 
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
		
		// ��÷ ���� Ȯ���ϱ�
		Arrays.sort(selectNumber);		// �������� ����
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);	// �迭 �׸� ��
		System.out.print("��÷ ���� : ");
		if(result) {
			System.out.println("1� ��÷�Ǽ̽��ϴ�.");
		} else {
			System.out.println("��÷���� �ʾҽ��ϴ�.");
		}
	}

}
