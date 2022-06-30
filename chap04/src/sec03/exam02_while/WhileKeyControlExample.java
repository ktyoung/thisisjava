package sec03.exam02_while;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode != 13 && keyCode != 10) { // 엔터키를 입력해도 변화가 없게끔
				System.out.println("-------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("-------------------");
				System.out.println("선택 : ");
			}
			keyCode = System.in.read();	// 문자 한 글자씩 입력받음
										// 11111을 입력하면 5만큼 한 번에 증가됨
			
			if(keyCode == 49) { // 1의 유니코드
				speed++;
				System.out.println("현재 속도 = " + speed);
			} else if (keyCode == 50) { // 2의 유니코드
				speed--;
				System.out.println("현재 속도 = " + speed);
			} else if (keyCode == 51) { // 3의 유니코드
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
