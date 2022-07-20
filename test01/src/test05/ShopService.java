package test05;


public class ShopService {
	// �ʵ�
	private static ShopService singleton = new ShopService();
	
	// ������ : �ٸ� Ŭ�������� �������� ���ϵ��� private�� ����
	private ShopService() {};
	
	// �޼��� : ����  Ÿ�� �� ShopService(Ŭ���� ����)
	public static ShopService getInstance() {
		return singleton;
	}
}
