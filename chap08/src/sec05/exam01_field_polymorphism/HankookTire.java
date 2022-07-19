package sec05.exam01_field_polymorphism;

// 구현 클래스 HankookTire
public class HankookTire implements Tire {

	@Override
	public void roll() {
		System.out.println("한국 타이어가 굴러갑니다.");
	}

}
