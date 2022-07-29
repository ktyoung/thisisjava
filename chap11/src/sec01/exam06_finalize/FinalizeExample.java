package sec01.exam06_finalize;

public class FinalizeExample {

	public static void main(String[] args) {
		Counter counter = null;
		for(int i=1; i<=50; i++) {		// 반복적인 객체 생성
			counter = new Counter(i);
			counter = null;				// Counter 객체를 쓰레기로 만듦
			System.gc();				// 쓰레기 수집기 실행 요청
		}
	}

}