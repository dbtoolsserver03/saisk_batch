package jp.co.yahoo.hw.ym202301.cc.test;

public class Test {

	
	
	public static void main(String[]args) {
	
	System.out.println(getUpperLetterNum("aAThush12768490ccd",5));
	
	}
	private static int getUpperLetterNum(String str,int num) {
		int result=0;
		int index=0;
		for(char ch:str.toCharArray()) {
			if(ch<'Z'&&ch>='A') {
				result++;
				if(index==num) {
					break;
				}
			}
		}
		
		return result;
	}
	
}




