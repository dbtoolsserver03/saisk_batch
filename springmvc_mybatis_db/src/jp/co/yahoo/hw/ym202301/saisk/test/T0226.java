package jp.co.yahoo.hw.ym202301.saisk.test;

public class T0226 {

	public String getLevel(int score) {
		
		String retStr = "";
		if(score>90) {
			retStr = "优" ;
		} else if (score>80) {
			retStr = "良" ;
		} else if (score>70) {
			retStr = "可" ;
		} else if (score>60) {
			retStr = "及格" ;
		}else{
			retStr = "不及格" ;
		}
		return retStr;
		
	}
}
