package sec01.exam06_finalize;

// finalize() : 객체 소멸자
// 참조하지 않는 배열이나 객체는 쓰레기 수집기(Garbage Collector)가 힙 영역에서 자동으로 소멸시킴
// 쓰레기 수집기는 객체를 소멸하기 직전에 마지막으로 객체 소멸자를 실행시킨다.
// 객체가 소멸되기 전에 마지막으로 사용했던 자원(데이터 연결, 파일 등)을 닫고 싶거나, 중요한 데이터를 저장하고 싶다면 Object의 finalize()를 재정의할 수 있다. 
public class Counter {
	private int no;
	
	public Counter(int no) {
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "번 객체의 finalize()가 실행됨");
	}
	
}
