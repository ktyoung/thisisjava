package sec07.exam08_abstract_class;

// �߻� Ŭ������ Ŭ������ �������� �κ�(����, �޼���)�� �����ؼ� ������ Ŭ����
// �߻� Ŭ������ ��ü�� ���� �� ���� �� ��ü���� ���� ��ü������ �ʱ� ����
// �߻� Ŭ������ ��ü Ŭ������ ��� ����

public class PhoneExample {

	public static void main(String[] args) {
		// Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("ȫ�浿");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
	}

}
