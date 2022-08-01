package sec03.exam03_time;

// System Ŭ������ currentTimeMillis(), nanoTime() �޼���� ��ǻ���� �ð�κ��� ���� �ð��� �о �и������� ������ ���뼼���� ������ long���� ����
public class SystemTimeExample {

	public static void main(String[] args) {
		long time1 = System.nanoTime();
		
		int sum = 0;
		for(int i=0; i<=1000000; i++) {
			sum += i;
		}
		long time2 = System.nanoTime();
		System.out.println("1~1000000������ �� : " + sum);
		System.out.println("��꿡 " + (time2-time1) + "ns�� �ҿ�Ǿ����ϴ�.");
	}
}
