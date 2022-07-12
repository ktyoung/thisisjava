package sec10.exam02_static_block;

public class Television {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	// static block
	static {
		info = company + "-" + model;
	}
}
