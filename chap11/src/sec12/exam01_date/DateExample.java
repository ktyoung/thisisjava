package sec12.exam01_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();	// ���� ��¥�� ���ڿ��� ��� ������ toString() �޼��� ���
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		String strNow2 = sdf.format(now);	// Ư�� ���ڿ� �������� ��� �ʹٸ� SimpleDataFormat Ŭ���� ���
		System.out.println(strNow2);

	}

}
