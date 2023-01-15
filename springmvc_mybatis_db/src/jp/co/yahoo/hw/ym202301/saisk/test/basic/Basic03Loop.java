package jp.co.yahoo.hw.ym202301.saisk.test.basic;

public class Basic03Loop {

	public static void main(String[] args) {

		System.out.println("add:" + add(1, 2));
		
		// 建议用for来写循环
		loopFor();
		
		
		loopWhile();
		loopDoWhile();
		
		loopContinueBeak();
	}

	private static void loopContinueBeak() {
		
		System.out.println("loopContinueBeak");
		for (int i = 0; i < 12; i++) {
			// i=5,6,7 跳过
			if(i<=7&& i>=5) {
				continue;
			}
			// i=10 跳出循环
			if(i==10) {
				break;
			}
			
			System.out.println(i);
		}
	}

	private static void loopDoWhile() {
		int count = 0;

		int i = 1;
		
		do {
			count = count + i;
			i++;
		} while (i <= 100);


		System.out.println("loopDoWhile:" + count);
		
	}

	private static void loopWhile() {
		int count = 0;

		int i = 1;
		while (i <= 100) {
			
			if(i==101) {
				break;
			}
			count = count + i;
			i++;
		}

		System.out.println("loopWhile:" + count);
	}

	private static void loopFor() {
		int count = 0;
		
		for (int i = 1; i <= 100; i++) {
			count = count + i;
		}
		System.out.println("loopFor:"+count);
	}

	// private 访问权限
	// static 静态

	// int 返回值的类型
	// add 方法名
	// x 第一个参数
	// y 第二个参数
	private static int add(int x, int y) {
		int s = x + y;
		return s;
	}

	// 定义方法：方法名，参数（类型，顺序，个数），返回值 

}
