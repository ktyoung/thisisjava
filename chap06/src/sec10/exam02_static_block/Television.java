package sec10.exam02_static_block;

public class Television {
	// static�� ���� �ϳ��� �����Ǿ� �����Ƿ� ��ü�� ������ ���� ����
	// static block �ȿ� �ʵ�� �޼��尡 ����Ǿ�� �� ��
	// ������ �ϳ��� ���� ������ �ʴ� ������ ���Ǹ� ������ ����
	
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	// �Ʒ��� �����ϰ� �����ϴ� �ڵ�
	// static String info = company + "-" + model
	
	// static block
	static {
		info = company + "-" + model;
	}
}
