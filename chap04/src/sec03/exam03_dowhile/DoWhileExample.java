package sec03.exam03_dowhile;

import java.util.Scanner; // Ctrl + Shift + O 누르면 자동 생성

public class DoWhileExample {

	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in); // 여러글자(문장)으로 인식해서 받아들임
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scanner.nextLine(); // 줄바꿈
			System.out.println(inputString);
		} while( ! inputString.equals("q") ); 	// 조건이 참이면 반복, 거짓이면 중지
												// q가 입력되면 false가 됨 - 중지
		
		System.out.println();
		System.out.println("프로그램 종료");
	}

}
