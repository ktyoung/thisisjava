package sec02_runtime_exception;

public class NullPointerExeptionExample {

	public static void main(String[] args) {
		String data = null;
		System.out.println(data.toString());	// ���� �߻�
		
		// data ������ null ���� ������ ������ String ��ü�� �����ϰ� ���� �ʴ�.
		// data.toString()���� String ��ü�� toString() �޼ҵ带 ȣ�� �� NullPointerExeption�� �߻��Ѵ�.
	}

}
