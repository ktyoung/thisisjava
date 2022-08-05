package test03;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		String[] strArray = { "10", "2a" };
		int value = 0;
		for(int i=0; i<=2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("�ε����� �ʰ�����");
			} catch(NumberFormatException e) {
				System.out.println("���ڷ� ��ȯ�� �� ����");
			} finally {
				System.out.println(value);
			}
		}
	}
}

// 10 �� value = strArray[0] = 10
// ���ڷ� ��ȯ�� �� ���� �� value = strArray[1] = 2a > ���ڰ� ���ԵǾ� ���� �߻�
// 10 �� value = 10 (finally ���� ����)
// �ε����� �ʰ����� �� strArray�� �ε����� 0, 1 ���̹Ƿ� i�� 2�� �� �ε��� �ʰ� ���� �߻�
// 10 �� value = 10 (finally ���� ����)