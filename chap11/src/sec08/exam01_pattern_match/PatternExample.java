package sec08.exam01_pattern_match;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		// (02|010) → 02 또는 010 , - , \d{3,4} → 3자리 또는 4자리 숫자 , - , \d{4} → 4자리 숫자
		String regExp = "(02|010-\\d{3,4}-\\d{4})";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		// \w+ → 한 개 이상의 알파벳 또는 숫자 , @ → @ 기호 , \w+ → 한 개 이상의 알파벳 또는 숫자 , \. → . , \w+ → 한 개 이상의 알파벳 또는 숫자 , 
		// (\.\w+)? → \.\w+ 이 없거나, 한 번 더 올 수 있음   
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w)?";
		data = "angel@naver.com";
		result = Pattern.matches(regExp, data);
		
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		// 날짜 형식 정규 표현식
		// ^ → 식의 시작, $ → 식의 끝
		// ^\\d{4}-\\d{2}-\\d{2}$
	}

}
