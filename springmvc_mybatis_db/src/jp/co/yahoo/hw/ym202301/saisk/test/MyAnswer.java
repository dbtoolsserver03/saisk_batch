package jp.co.yahoo.hw.ym202301.saisk.test;

public class MyAnswer {

	//	求一个方法isSymmetry(String str)
	//	如果是abccba  返回true
	//	如果是abcscba 返回true
	//	如果是abcsbba 返回false

	public static void main(String[] args) {

		System.out.println(add(1, 2));

		String a="abcsxxcba";
		System.out.println(isSymmetry(a));
		
		System.out.println(isSymmetry2(a));
	}

	public static boolean isSymmetry(String str) {

		boolean ret = true;
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) != str.charAt(str.length()-1-i)) {
				ret = false;
			} 
			
		}
		
		return ret;
	}
	public static boolean isSymmetry2(String str) {
		StringBuffer sb = new StringBuffer(str);
		
		return sb.reverse().toString().equals(str);
	}

	

	public static int add(int i, int j) {
		return i + j;
	}

}
