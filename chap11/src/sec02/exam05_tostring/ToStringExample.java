package sec02.exam05_tostring;

import java.util.Objects;

// Objects.toString()은 객체의 문자 정보를 리턴하는데 아래 두 가지로 오버로딩 되어있다.
// 1. toString(Object o), 2. toString(Object o, String nullDefault) 
public class ToStringExample {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2, "이름이 없습니다."));

	}

}
