package sec14.getter_setter;

public class Car {
	// 필드
	private int speed;
	private boolean stop;
	
	// 생성자
	
	// 메서드
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {		// Setter
		if(speed < 0) {
			this.speed = 0; // 매개값이 음수라면 필드에 0으로 저장하고 메서드 실행 종료
			return;
		} else {
			this.speed = speed;
		}
	}
	public boolean isStop() {				// Getter
		return stop;
	}
	public void setStop(boolean stop) {		// Setter
		this.stop = stop;
		this.speed = 0;
	}
}
