package sec09.exam01_array;

import java.util.Arrays;

// String 배열은 Arrays.sort() 메서드는 메서드의 매개값으로 지정해주면 자동으로 오름차순 정렬이 된다.
// 사용자 정의 클래스 타입일 경우에는 클래스가 Comparable 인터페이스를 구현하고 있어야 정렬된다.
public class SortExample {

	public static void main(String[] args) {
		int[] scores = { 99, 97, 98 };
		Arrays.sort(scores);
		for(int i=0; i<scores.length; i++){
			System.out.println("scores[" + i + "] = " + scores[i]);
		}
		System.out.println();
		
		String[] names = { "홍길동", "박동수", "김민수" };
		for(int i=0; i<names.length; i++) {
			System.out.println("names[" + i + "] = " + names[i]);
		}
		System.out.println();
		
		Member m1 = new Member("홍길동");
		Member m2 = new Member("박동수");
		Member m3 = new Member("김민수");
		Member[] members = { m1, m2, m3 };
		Arrays.sort(members);
		for(int i=0; i<members.length; i++) {
			System.out.println("members[" + i + "] = " + members[i].name);
		}
	}
}
