package sec08.exam01_pattern_match;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		// (02|010) �� 02 �Ǵ� 010 , - , \d{3,4} �� 3�ڸ� �Ǵ� 4�ڸ� ���� , - , \d{4} �� 4�ڸ� ����
		String regExp = "(02|010-\\d{3,4}-\\d{4})";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		
		if(result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		} else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}
		
		// \w+ �� �� �� �̻��� ���ĺ� �Ǵ� ���� , @ �� @ ��ȣ , \w+ �� �� �� �̻��� ���ĺ� �Ǵ� ���� , \. �� . , \w+ �� �� �� �̻��� ���ĺ� �Ǵ� ���� , 
		// (\.\w+)? �� \.\w+ �� ���ų�, �� �� �� �� �� ����   
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w)?";
		data = "angel@naver.com";
		result = Pattern.matches(regExp, data);
		
		if(result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		} else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}
		
		// ��¥ ���� ���� ǥ����
		// ^ �� ���� ����, $ �� ���� ��
		// ^\\d{4}-\\d{2}-\\d{2}$
	}

}
