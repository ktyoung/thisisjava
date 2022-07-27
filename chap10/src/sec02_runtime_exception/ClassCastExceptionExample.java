package sec02_runtime_exception;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);

	}
	public static void changeDog(Animal animal) {
		Dog dog = (Dog) animal;		// Ÿ�� ��ȯ(Casting)�� ���� Ŭ������ ���� Ŭ���� ���̿� �߻��ϰ�, ���� Ŭ������ �������̽� ���̿����� �߻��Ѵ�.
									// �� �̷��� ���谡 �ƴϸ� Ŭ������ �ٸ� Ŭ������ Ÿ�� ��ȯ�� �Ұ����ϴ�.
									// ����, ������ Ÿ�� ��ȯ�� �õ��ϸ� ClassCastException�� �߻��Ѵ�.
	}

}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}