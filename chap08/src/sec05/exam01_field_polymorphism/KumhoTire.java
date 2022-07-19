package sec05.exam01_field_polymorphism;

//구현 클래스 KumhoTire
public class KumhoTire implements Tire {

	@Override
	public void roll() {
		System.out.println("금호 타이어가 굴러갑니다.");
	}

}
