package sec03.exam04_break;

public class BreakExample {

	public static void main(String[] args) throws Exception {
		while(true) { // 무한반복
			int num = (int)(Math.random()*6) + 1; // 난수를 무한하게 생성함
			System.out.println(num);
			if(num == 6) { 
				break; // 난수 중 6이 생성되면 프로그램 종료
			}
		}
		System.out.println("프로그램 종료");

	}

}
