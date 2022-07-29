package sec01.exam03_toString;

import java.util.Date;

// toString() 메서드는 객체의 문자 정보를 리턴한다.
// 객체 문자 정보 : 객체를 문자열로 표현한 값, 기본적으로 Object의 toString() 메서드는 "클래스명@16진수해시코드"로 구성된 문자 정보를 리턴
public class ToStringExample {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());

	}

}
