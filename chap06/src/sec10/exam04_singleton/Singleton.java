package sec10.exam04_singleton;

public class Singleton {
	// Singleton : ��ü�� �ϳ��� ������ �� ����
	// public : �ܺο��� ���� ����(�ٸ� Ŭ���������� ��� ����)
	// private : �ܺο��� ���� ����(���� Ŭ���������� ��� ����)
	
	private static Singleton singLeton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return singLeton;
	}
}
