package sec03.exam01_multi_type_parameter;

public class ProductExample {

	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("����ƮTV");
		Tv tv = product1.getKind();

	}

}
