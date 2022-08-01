package sec03.exam03_time;

// System 클래스의 currentTimeMillis(), nanoTime() 메서드는 컴퓨터의 시계로부터 현재 시간을 읽어서 밀리세컨드 단위와 나노세컨드 단위의 long값을 리턴
public class SystemTimeExample {

	public static void main(String[] args) {
		long time1 = System.nanoTime();
		
		int sum = 0;
		for(int i=0; i<=1000000; i++) {
			sum += i;
		}
		long time2 = System.nanoTime();
		System.out.println("1~1000000까지의 합 : " + sum);
		System.out.println("계산에 " + (time2-time1) + "ns가 소요되었습니다.");
	}
}
