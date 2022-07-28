package sec05_try_with_resource;

public class TryWithResourceExample {

	public static void main(String[] args) {
		// try의 () 부분에 resource의 객체 구문이 들어간다.
		// try 블록이 정상적으로 실행을 완료했거나, 예외가 발생하면 자동으로 AutoCloseable의 close() 메서드가 호출된다.
		// try 블록에서 예외가 발생하면, 우선 close() 메서드로 리소스를 닫고 catch 블록을 실행한다.
		try(FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception();
		} catch(Exception e) {
			System.out.println("예외 처리 코드 발생");
		}

	}

}
