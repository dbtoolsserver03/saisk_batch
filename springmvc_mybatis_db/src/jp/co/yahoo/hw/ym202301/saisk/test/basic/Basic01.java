package jp.co.yahoo.hw.ym202301.saisk.test.basic;


// public 类名要和文件名一致。
// class 名要大写
// 一个java 文件里，有且只能有一个public class

public class Basic01 {

	public static void main(String[] args) {
		
		// Java的八种基本类型(byte,short,int,long,float,double,boolean,char)
//		Java的八种基本数据类型，分别是：
//		1)四种整数类型(byte、short、int、long)
//		2)两种浮点数类型(float、double)
//		3)一种字符类型(char)
//		4)一种布尔类型(boolean)

		// https://blog.csdn.net/babalaile_/article/details/124389762
		
		byte b=	1;
		System.out.println(b);
		
		short s=210;
		System.out.println(s);
		
		int i=100;
		System.out.println(i);
		
		float f=1.5f;
		System.out.println(f);

		double d=1.6;
		System.out.println(d);
		
		// https://www.k-cube.co.jp/wakaba/server/ascii_code.html
		char c=65;
		System.out.println(c);
		
		boolean bool = false;
		System.out.println(bool);
		
		System.out.println("---------------");

		i=s;
		System.out.println("i=s:"+i);
		
		i=1000000000;
		System.out.println(i);
		s=(short)i;
		System.out.println("s=i:"+s);
		

	}
}


class Basic1 {

	
}

class Basic2 {

	
}
