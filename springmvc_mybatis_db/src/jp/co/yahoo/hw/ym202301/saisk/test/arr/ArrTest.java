package jp.co.yahoo.hw.ym202301.saisk.test.arr;

public class ArrTest {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		
		// 不推荐写法
		// int arr[] = {1,2,3};
		
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			System.out.println("第"+i+"个数字"+num);
		}
		
		System.out.println("当不需要下标时，建议用下面的写法");
		for (int num : arr) {
			System.out.println(num);
		}

	}

}
