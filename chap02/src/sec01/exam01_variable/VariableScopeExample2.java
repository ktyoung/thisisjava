package sec01.exam01_variable;

public class VariableScopeExample2 {

	public static void main(String[] args) {
		int v1 = 15;
		
		if(v1 > 10) {
			int v2;
			v2 = v1 - 10;
		}
		
		// int v3 = v1 + v2 + 5; 컴파일 에러 : v2가 지역변수임
		int v3 = v1 + v1 + 5; // v1이 전역변수이므로 사용 가능함
		System.out.println(v3);
		
	}
}
