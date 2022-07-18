package sec02.exam02_constant_field;

public interface RemoteControld {
	// 절대적 : 정말 아무것도 손댈 수 없음
	// 강제적 : 인터페이스를 implements하지 않으면 피할수는 있음
	
	// 인터페이스로 정의한 상수
	// → 인터페이스에서 값을 정해줄테니, 값을 함부로 변경하지 말고 제공해주는 값만 참조하라(절대적)	
	int MAX_VALUE = 10;
	int MIN_VALUE = 0;
}