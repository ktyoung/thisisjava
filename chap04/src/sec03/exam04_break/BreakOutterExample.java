package sec03.exam04_break;

public class BreakOutterExample {

	public static void main(String[] args) {
		Outter : for(char upper='A'; upper<='Z'; upper++) { // Outter은 바깥 for문의 이름(라벨)
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break Outter; // Outter 라벨을 가진 for문 종료
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}

}
