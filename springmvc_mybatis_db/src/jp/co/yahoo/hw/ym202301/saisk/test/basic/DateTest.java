package jp.co.yahoo.hw.ym202301.saisk.test.basic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	
	public static void main(String[] args) {
		
		
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String strDate = sdf.format(date);
		
		
		System.out.println(strDate);
	}
	


}
