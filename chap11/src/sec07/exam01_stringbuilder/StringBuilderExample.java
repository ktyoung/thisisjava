package sec07.exam01_stringbuilder;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();			// StringBuilder 객체 추가
		
		sb.append("Java ");								// 문자열을 끝에 추가
		sb.append("Program Study");						// append() → 문자열 끝에 주어진 매개값을 추가
		System.out.println(sb.toString());
		
		sb.insert(4, "2");								// 4번째 문자 뒤에 2 삽입
		System.out.println(sb.toString());				// insert() → 문자열 중간에 주어진 매개값을 추가
		
		sb.setCharAt(4, '6');							// 4번째 문자 뒤의 문자를 6으로 변경
		System.out.println(sb.toString());				// setCharAt() → 문자열에서 주어진 index의 문자를 다른 문자로 대치
		
		sb.replace(6, 13, "Book");						// 6번째 문자 뒤부터 13번째 문자까지 "Book"으로 대치
		System.out.println(sb.toString());				// replace() → 문자열의 일부분을 다른 문자열로 대치
		
		sb.delete(4, 5);								// 5번째 문자 삭제
		System.out.println(sb.toString());				// delete() → 문자열의 일부분을 삭제
		
		int length = sb.length();						// 총 문자 수 얻기
		System.out.println("총 문자 수 : " + length);
		
		String result = sb.toString();					// 버퍼에 있는 것을 String 타입으로 리턴
		System.out.println(result);

	}

}
