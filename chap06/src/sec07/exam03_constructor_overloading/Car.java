package sec07.exam03_constructor_overloading;

public class Car {
	String company = "�����ڵ���";
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
		this.model = model; // �� model�� �ʵ�, �� model�� �Ű�����
		this.color = color; 
		this.maxSpeed = maxSpeed;
	}
}