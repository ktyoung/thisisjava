package sec01.exam01_equals;

public class MemberExample {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {									// �Ű����� Member Ÿ���̰� id �ʵ� ���� �����ϹǷ� true
			System.out.println("obj1�� obj2�� �����մϴ�.");
		} else {
			System.out.println("obj1�� obj2�� �������� �ʽ��ϴ�.");
		}
		
		System.out.println();
		
		if(obj1 == obj2) {
			System.out.println("obj1�� obj2�� �����մϴ�.");
		} else {
			System.out.println("obj1�� obj2�� �������� �ʽ��ϴ�.");
		}
		
		System.out.println();
		
		if(obj1.equals(obj3)) {									// �Ű����� Member Ÿ��������, id �ʵ� ���� �������� �����Ƿ� false
			System.out.println("obj1�� obj3�� �����մϴ�.");
		} else {
			System.out.println("obj1�� obj3�� �������� �ʽ��ϴ�.");
		}
	}

}
