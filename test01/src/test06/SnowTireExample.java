package test06;

public class SnowTireExample {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;	// ����ȯ
		
		snowTire.run();
		tire.run();
	}

}
