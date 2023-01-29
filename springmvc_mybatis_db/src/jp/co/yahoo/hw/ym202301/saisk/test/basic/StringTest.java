package jp.co.yahoo.hw.ym202301.saisk.test.basic;

public class StringTest {

	public static void main(String[] args) {
		
		String str="hello world";
		

		System.out.println(str.charAt(0));
		System.out.println(str.length());
		
		System.out.println("----------");
		
		
		for(char ch : str.toCharArray()) {
			System.out.println(ch);
		}
		
		System.out.println("----------");
		
		System.out.println(str.substring(0, 5));
		
		System.out.println(str.contains("llo"));
		System.out.println(str.indexOf("l"));
		System.out.println(str.lastIndexOf("l"));
		
		System.out.println(str.isEmpty());
		
		System.out.println(str.startsWith("hel"));
		System.out.println(str.endsWith("ld"));
		System.out.println(str.toUpperCase());
		
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		String a = "hello abcd";
		
		System.out.println(str.equals(a));
		
		// str="hello world"   <  a = "hello abcd"
		System.out.println(str.compareTo(a)<0);
		

	}

}
