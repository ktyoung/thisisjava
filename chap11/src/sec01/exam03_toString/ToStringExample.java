package sec01.exam03_toString;

import java.util.Date;

// toString() �޼���� ��ü�� ���� ������ �����Ѵ�.
// ��ü ���� ���� : ��ü�� ���ڿ��� ǥ���� ��, �⺻������ Object�� toString() �޼���� "Ŭ������@16�����ؽ��ڵ�"�� ������ ���� ������ ����
public class ToStringExample {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());

	}

}
