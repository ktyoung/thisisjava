package sec04.exam02_reflection;

public class Car {
	private String model;
	public String owner;
	
	public Car() {
		
	}

	public Car(String model) {
		this.model = model;
	}

	public String getOwner() {
		return owner;
	}

	public String getModel() {
		return model;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
}
