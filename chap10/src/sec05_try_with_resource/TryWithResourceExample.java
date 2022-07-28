package sec05_try_with_resource;

public class TryWithResourceExample {

	public static void main(String[] args) {
		// try�� () �κп� resource�� ��ü ������ ����.
		// try ����� ���������� ������ �Ϸ��߰ų�, ���ܰ� �߻��ϸ� �ڵ����� AutoCloseable�� close() �޼��尡 ȣ��ȴ�.
		// try ��Ͽ��� ���ܰ� �߻��ϸ�, �켱 close() �޼���� ���ҽ��� �ݰ� catch ����� �����Ѵ�.
		try(FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception();
		} catch(Exception e) {
			System.out.println("���� ó�� �ڵ� �߻�");
		}

	}

}
