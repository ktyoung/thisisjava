package sec02_runtime_exception;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);

	}
	public static void changeDog(Animal animal) {
		Dog dog = (Dog) animal;		// 타입 변환(Casting)은 상위 클래스와 하위 클래스 사이에 발생하고, 구현 클래스와 인터페이스 사이에서도 발생한다.
									// → 이러한 관계가 아니면 클래스는 다른 클래스로 타입 변환이 불가능하다.
									// 따라서, 억지로 타입 변환을 시도하면 ClassCastException이 발생한다.
	}

}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}