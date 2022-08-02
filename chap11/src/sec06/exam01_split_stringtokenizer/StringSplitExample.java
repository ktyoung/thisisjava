package sec06.exam01_split_stringtokenizer;

// 문자열이 특정 구분자로 연결되어 있을 경우, 구분자를 기준으로 문자열을 분리하기 위해서는 String의 split() 메서드를 이용하거나,
// java.util 패키지의 StringTokenizer 클래스를 이용할 수 있다.
// split()은 정규 표현식으로 구분하고, StringTokenizer는 문자로 구분하는 차이점이 있다. 
public class StringSplitExample {

	public static void main(String[] args) {
		String text = "홍길동&이수홍,박연수,김자바-최명호";
		String[] names = text.split("&|,|-");
		
		for(String name : names) {
			System.out.println(name);
		}

	}

}
