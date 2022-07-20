package test05;


public class ShopService {
	// 필드
	private static ShopService singleton = new ShopService();
	
	// 생성자 : 다른 클래스에서 접근하지 못하도록 private로 선언
	private ShopService() {};
	
	// 메서드 : 리턴  타입 → ShopService(클래스 변수)
	public static ShopService getInstance() {
		return singleton;
	}
}
