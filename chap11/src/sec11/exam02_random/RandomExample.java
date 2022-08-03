package sec11.exam02_random;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// 선택 번호
		int[] selectNumber = new int[6];	// 선택 번호 6개가 저장될 배열
		Random random = new Random(/*3*/);		// 선택 번호를 얻기 위한 Random 객체 생성, Random(시드값) → 시드값이 없으면 랜덤 생성 가능
		System.out.print("선택 번호 : ");
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;	// 선택 번호를 얻어 배열에 저장 
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		// 당첨 번호
		int[] winningNumber = new int[6];
		random = new Random(/*5*/);
		System.out.print("당첨 번호 : ");
		for(int i=0; i<6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;	// 선택 번호를 얻어 배열에 저장 
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
		
		// 당첨 여부 확인하기
		Arrays.sort(selectNumber);		// 오름차순 정렬
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);	// 배열 항목값 비교
		System.out.print("당첨 여부 : ");
		if(result) {
			System.out.println("1등에 당첨되셨습니다.");
		} else {
			System.out.println("당첨되지 않았습니다.");
		}
	}

}
