package sec04.exam02_super;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();	// �̷�
		sa.fly();		// �Ϲݺ���
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();		// �����Ӻ���
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();		// �Ϲݺ���
		sa.land();		// ����

	}

}
