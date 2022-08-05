package test09;

public class Member {
	private String id;
	private String name;
    
	public Member(String id, String name) {
    	this.id = id;
    	this.name = name;
	}
    
	// "toString()" 메서드는 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메서드
    @Override
    public String toString() {
    	return id + " : " + name;
    }
}