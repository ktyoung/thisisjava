package test08;

import java.text.SimpleDateFormat;
import java.util.Date;
 
public class DatePrintExample {
 
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY�� MM�� DD�� E���� k�� m��");
        System.out.println(sdf.format(now));
    }
}
