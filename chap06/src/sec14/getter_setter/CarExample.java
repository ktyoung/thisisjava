package sec14.getter_setter;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car(); // 객체 생성
		
		// 잘못된 속도 변경
		myCar.setSpeed(-50);
		
		System.out.println("현재 속도 : " + myCar.getSpeed()); // 0 출력 : 
															// speed 필드 값을 음수로 변경하려 하면, Setter인 setSpeed에서 매개값 검사 후 0으로 변경
		
		// 올바른 속도 변경
		myCar.setSpeed(60);
		
		// 멈춤
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("현재 속도 : " + myCar.getSpeed()); // 0 출력 :
															// stop 필드의 Getter인 isStop() 리턴값이 false일 경우,
															// Setter인 setStop(true)를 호출해서 stop 필드를 true로, speed 필드를 0으로 변경

	}

}
