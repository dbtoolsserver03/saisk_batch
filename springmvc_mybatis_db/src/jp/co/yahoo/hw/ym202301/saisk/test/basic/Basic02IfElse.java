package jp.co.yahoo.hw.ym202301.saisk.test.basic;

public class Basic02IfElse {

	public static void main(String[] args) {

		int a = 1;
		int b = 3;
		int min = 0;

		System.out.println("语句：if ");
		if (a<b) {

			System.out.println("确实 a<b");
			
			if (b==a+1) {
				System.out.println("确实 b==a+1");
			}
		}
		
		
		System.out.println("语句：if else ");
		if (a <= b) {
			min = a;
		} else {
			min = b;
		}
		System.out.println(min);
		
		System.out.println("语句：三目运算符");
		// 三目运算符
		// https://www.cnblogs.com/jialiangliang/p/5990581.html
		min = a <= b ? a : b;
		System.out.println(min);
		
		System.out.println("语句：if else");
		int score=60;
		
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
		
		System.out.println("语句：switch");
		
		// switch 语句 没有特殊情况不能忘了break;
		int type = 2;
		switch (type) {
		
		// case 后面可以是数字，字符，枚举
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

		
		System.out.println("后自加测试");
		// 后自加
		int xa=1;
		
		// ay=ax;ax=ax+1;
		int ya=xa++;
		System.out.println("xa="+xa);
		System.out.println("ya="+ya);
		
		System.out.println("前自加测试");
		// 前自加
		int ax=1;
		
		// ax=ax+1; ay=ax;
		int ay=++ax;
		System.out.println("ax="+ax);
		System.out.println("ay="+ay);
		
		
//		int  i=0;
//		int j=i++;   // 日本人推荐写法 j=i;i=i+1;
//		System.out.println(j);
		// https://www.jb51.net/article/179905.htm

		
		// 短路
		int x = 1;
		int aa = 1;
		System.out.println("短路或测试");
		if (aa == 1 || ++x > 0) {
			
		}
		System.out.println("x=" + x);
		
		System.out.println("短路与测试");
		if (aa == 2 && ++x > 0) {
			
		}
		System.out.println("x=" + x);
	
	
	}
}
