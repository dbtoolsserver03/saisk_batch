package jp.co.yahoo.hw.ym202301.saisk.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	//

	public static void main(String[] args) {

		String str = "Aa121bSadDD44566fsdDddC@gmail.com";
		System.out.println(getUpperLetterNum(str));
		System.out.println(getUpperLetters(4,str));
		System.out.println(isEmail(str));
	}

	// 做一个方法，判断入力的字符串是否是一个邮件地址，如果是返回TRUE，不是返回FAULSE
	// https://www.runoob.com/regexp/regexp-tutorial.html
	private static boolean isEmail(String email) {
		boolean retBool = false;

		String str="^[A-Za-z0-9\\u4e00-\\u9fa5]+@[a-zA-Z0-9_-]+(.[a-zA-Z0-9_-]+)+$";
       Pattern p = Pattern.compile(str);     
       Matcher m = p.matcher(email);     
       retBool =  m.matches();    

		return retBool;
	}

	// 做一个方法，返回字符串里面的前N个大写字母 
	// 比如 返回"adfA,ddsDaDdfjS"前3个大写字母，返回ADK
	private static String getUpperLetters(int num, String str) {
		String retStr="";
		int index = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) <= 'Z' && str.charAt(i) >= 'A') {
				retStr=retStr+str.charAt(i);
				index++;
			}
			if (index==num) {
				break;
			}
		}
		
		return retStr;
	}

	// 做一个方法，返回字符串里面的大写字母个数
	private static int getUpperLetterNum(String str) {
		int result = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) <= 'Z' && str.charAt(i) >= 'A') {
				result++;
			}
		}

		//		for (char ch : str.toCharArray()) {
		//			if (ch <= 'Z' && ch >= 'A') {
		//				result++;
		//			}
		//		}

		//		String str2=str.toLowerCase();
		//		
		//		for (int i = 0; i < str.length(); i++) {
		//			if (str.charAt(i) != str2.charAt(i)) {
		//				result++;
		//			}
		//		}
		return result;
	}
}
