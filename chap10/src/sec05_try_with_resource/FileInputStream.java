package sec05_try_with_resource;

// ���ҽ� ��ü�� AutoCloseable �������̽��� �����ϰ� �־�� �Ѵ�.
// AutoCloseable���� close() �޼��尡 ���ǵǾ� �ְ� try-with-resource�� �� close() �޼��带 �ڵ� ȣ���Ѵ�.
public class FileInputStream implements AutoCloseable {
	private String file;
	
	public FileInputStream(String file) {
		this.file = file;
	}
	public void read() {
		System.out.println(file + "�� �н��ϴ�.");
	}
	@Override
	public void close() throws Exception {
		System.out.println(file + "�� �ݽ��ϴ�.");
	}
}
