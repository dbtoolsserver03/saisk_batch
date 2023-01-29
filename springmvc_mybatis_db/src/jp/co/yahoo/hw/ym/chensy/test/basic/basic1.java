package jp.co.yahoo.hw.ym.chensy.test.basic;

public class basic1 {

}
class Basic01 {
public static void main(String[] args) {
byte b=	54;
System.out.println(b);

short s=1990;
System.out.println(s);

int i=10;
System.out.println(i);

float f=1.99f;
System.out.println(f);

double d=13.6;
System.out.println(d);

// https://www.k-cube.co.jp/wakaba/server/ascii_code.html
char c=65;
System.out.println(c);

boolean bool = false;
System.out.println(bool);



}
}
class Basic02  {

	public static void main(String[] args) {

		int a = 100;
		int b = 44;
		int min = 0;

		if (a<b) {
		
				System.out.println("b");
			}
		
		if (a <= b) {
			min = a;
		} else {
			min = b;
		}
		System.out.println(min);
		

		min = a <= b ? a : b;
		System.out.println(min);
		
		int score=99;
		
		if (score < 60) {
			System.out.println("不及格");
		} else if (score < 70) {
			System.out.println("及格");
		} else if (score < 80) {
			System.out.println("可");
		} else if (score < 90) {
			System.out.println("良");
		} else if (score <= 100) {
			System.out.println("优");
		} else {
			System.out.println("100+");
		}
		
		int type = 7;
		switch (type) {
		
		case 1:
			System.out.println(111);
			break;
		case 2:
			System.out.println(222);
		case 3:
			System.out.println(333);
			break;
		default:
			System.out.println("others");
			break;
		}
	}
}