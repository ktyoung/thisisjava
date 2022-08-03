package sec11.exam02_random;

// random() 메서드는 0.0과 1.0 사이의 범위에 속하는 하나의 double 타입 값을 리턴한다. (0.0 <= Math.random() <= 1.0)
public class MathRandomExample {

	public static void main(String[] args) {
		int num = (int) (Math.random()*6) + 1;
		System.out.println("주사위 눈 : " + num);

	}

}
