package sec02.exam05_tostring;

import java.util.Objects;

// Objects.toString()�� ��ü�� ���� ������ �����ϴµ� �Ʒ� �� ������ �����ε� �Ǿ��ִ�.
// 1. toString(Object o), 2. toString(Object o, String nullDefault) 
public class ToStringExample {

	public static void main(String[] args) {
		String str1 = "ȫ�浿";
		String str2 = null;
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2, "�̸��� �����ϴ�."));

	}

}
