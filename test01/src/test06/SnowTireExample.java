package test06;

public class SnowTireExample {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;	// Çüº¯È¯
		
		snowTire.run();
		tire.run();
	}

}
