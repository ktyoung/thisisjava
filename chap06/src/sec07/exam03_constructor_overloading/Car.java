package sec07.exam03_constructor_overloading;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car() {
		
	}
	
	Car(String model) {
		this.model = model;
	}
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model; // 앞 model은 필드, 뒤 model은 매개변수
		this.color = color; 
		this.maxSpeed = maxSpeed;
	}
}