package test04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BytesToStringExample {
	 
    public static void main(String[] args) {
    	Date now = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� HH�� mm��");

		System.out.println(sdf.format(now));
    }
}