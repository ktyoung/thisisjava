package sec14.getter_setter;

public class Car {
	// �ʵ�
	private int speed;
	private boolean stop;
	
	// ������
	
	// �޼���
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {		// Setter
		if(speed < 0) {
			this.speed = 0; // �Ű����� ������� �ʵ忡 0���� �����ϰ� �޼��� ���� ����
			return;
		} else {
			this.speed = speed;
		}
	}
	public boolean isStop() {				// Getter
		return stop;
	}
	public void setStop(boolean stop) {		// Setter
		this.stop = stop;
		this.speed = 0;
	}
}
