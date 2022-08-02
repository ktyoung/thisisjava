package sec05.exam03_method;

// 문자열의 앞뒤 공백을 제거한 새로운 문자열을 생성하고 리턴하는 trim()
// → 원래 문자열의 공백이 제거되는 것이 아니다!
public class StringTrimExample {

	public static void main(String[] args) {
		String tel1 = "   02";
		String tel2 = "123   ";
		String tel3 = "   1234   ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);

	}

}
