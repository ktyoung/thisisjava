package sec11.exam02_random;

// random() �޼���� 0.0�� 1.0 ������ ������ ���ϴ� �ϳ��� double Ÿ�� ���� �����Ѵ�. (0.0 <= Math.random() <= 1.0)
public class MathRandomExample {

	public static void main(String[] args) {
		int num = (int) (Math.random()*6) + 1;
		System.out.println("�ֻ��� �� : " + num);

	}

}
