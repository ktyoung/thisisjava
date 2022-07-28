package sec05_try_with_resource;

// 리소스 객체는 AutoCloseable 인터페이스를 구현하고 있어야 한다.
// AutoCloseable에는 close() 메서드가 정의되어 있고 try-with-resource는 이 close() 메서드를 자동 호출한다.
public class FileInputStream implements AutoCloseable {
	private String file;
	
	public FileInputStream(String file) {
		this.file = file;
	}
	public void read() {
		System.out.println(file + "을 읽습니다.");
	}
	@Override
	public void close() throws Exception {
		System.out.println(file + "을 닫습니다.");
	}
}
