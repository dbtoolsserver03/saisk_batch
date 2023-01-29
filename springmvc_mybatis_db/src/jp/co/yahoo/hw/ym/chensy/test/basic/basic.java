package jp.co.yahoo.hw.ym.chensy.test.basic;
public class basic{
	public static void main(String[] args) {
		//syso

		int count = 0;
		for (int i = 1; i <= 100; i++) {
			count = count + i;
		}
		System.out.println("For" + count);
		
		loopWhile();loopDoWhile();loopContinueBreak();
	}

	private static void loopContinueBreak() {
	
		System.out.println("loopContinueBrea");
		for(int i=0; i<=14;i++) {
		if (i<=11&&i>8) {
			continue;
		}
			if(i==13) {
			break;
		}
				System.out.println(i);
		}
		}
	
		
	

	private static void loopWhile() {
		int count = 0;
		int i = 1;
		while (i <= 100) {
			if (i == 101) {
				break;

			}
			count = count + i;
			i++;
		}
		System.out.println("loopwhile" + count);
	}
	
  
	private static void loopDoWhile() {
		int count = 0;
		int i = 1;
		do {
			count = count + i;
			i++;
		} while (i <= 100);

		System.out.println("loopDowhile" + count);
	}
}

