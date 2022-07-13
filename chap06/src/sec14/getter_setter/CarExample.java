package sec14.getter_setter;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car(); // ��ü ����
		
		// �߸��� �ӵ� ����
		myCar.setSpeed(-50);
		
		System.out.println("���� �ӵ� : " + myCar.getSpeed()); // 0 ��� : 
															// speed �ʵ� ���� ������ �����Ϸ� �ϸ�, Setter�� setSpeed���� �Ű��� �˻� �� 0���� ����
		
		// �ùٸ� �ӵ� ����
		myCar.setSpeed(60);
		
		// ����
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("���� �ӵ� : " + myCar.getSpeed()); // 0 ��� :
															// stop �ʵ��� Getter�� isStop() ���ϰ��� false�� ���,
															// Setter�� setStop(true)�� ȣ���ؼ� stop �ʵ带 true��, speed �ʵ带 0���� ����

	}

}
