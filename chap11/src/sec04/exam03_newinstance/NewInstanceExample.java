package sec04.exam03_newinstance;

// ���� ��ü ���� newInstance()
// Ŭ���� ��ü�� �̿��ϸ� new �����ڸ� ������� �ʾƵ� �������� ��ü�� ������ �� �ִ�.
// �� ����� �ڵ� �ۼ� �ÿ� Ŭ���� �̸��� ������ �� ����, ��Ÿ�� �ÿ� Ŭ���� �̸��� �����Ǵ� ��쿡 �����ϰ� ���ȴ�.
// newInstance() �޼���� �⺻ �����ڸ� ȣ���Ͽ� ��ü�� �����ϱ� ������ �ݵ�� Ŭ������ �⺻ �����ڰ� �����ؾ� �Ѵ�.
public class NewInstanceExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("sec04.exam03_newinstance.SendAction");
			// Class clazz = Class.forName("sec04.exam03_newinstance.ReceiveAction");
			Action action = (Action) clazz.newInstance();
			action.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

	}

}
