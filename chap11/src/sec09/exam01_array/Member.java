package sec09.exam01_array;

public class Member implements Comparable<Member> {
	String name;
	Member(String name) {
		this.name = name;
	}
	
	// Comparable<Member> : Member 타입만 비교하기 위해 제네릭 <> 사용
	// compareTo() : 비교값을 리턴하도록 오버라이딩
	// 오름차순일 때, 자신이 매개값보다 낮을 경우 음수, 같을 경우 0, 높을 경우 양수를 리턴하면 된다.
	// 내림차순일 때, 자신이 매개값보다 낮을 경우 양수, 같을 경우 0, 높을 경우 음수를 리턴하면 된다.
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);	// name 필드값으로 정렬 → 유니코드를 비교해야 하므로, String의 compareTo() 리턴값을 사용
	}
	
	
}
