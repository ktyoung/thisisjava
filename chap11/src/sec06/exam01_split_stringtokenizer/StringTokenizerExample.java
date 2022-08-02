package sec06.exam01_split_stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";
		
		// 방법 1. 전체 토큰 수를 얻어서 for문으로 출력
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();
		for(int i=0; i<countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		System.out.println();
		
		// 방법 2. 남아있는 토근을 확인하고 while문으로 Looping
		st = new StringTokenizer(text, "/");
		while(st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
		}

	}

}
