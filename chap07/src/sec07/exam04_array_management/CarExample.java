package sec07.exam04_array_management;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<5 ; i++) {
			int problemLocation = car.run();
			
			// 1�� ��ũ
			// if(1 != 0)
			if(problemLocation != 0) {
				System.out.println(car.tires[problemLocation-1].location + " HankookTire�� ��ü");
				// car.tires[0].location
				
				// ������ ���� �迭 ��ġ�� Ÿ�̾ ��ü��
				car.tires[problemLocation-1] = new HankookTire(car.tires[problemLocation-1].location, 15);   
			}
			System.out.println("==============================");
		}
	}
}	