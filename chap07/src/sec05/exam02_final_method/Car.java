package sec05.exam02_final_method;

public class Car {
	// �θ� Ŭ����
	
	public int speed;
	
	public void speedUp() {
		speed += 1;
	}
	
	public final void stop() {
		System.out.println("���� ����");
		speed = 0;
	}
}