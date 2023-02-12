package jp.co.yahoo.hw.ym20230212.saisk.test.exe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;


/*
 *・ 方法里写CATCH，CATCH可能出现的各种异常，CATCH异常的顺序是由小范围到大范围
 *・ 方法抛出异常时，要抛出可能产生异常的最大异常类，一般是Throwable，
 *   一旦执行代码异常发生，那么该行代码后面的代码都不会执行（除了finally 语句块里代码）。程序返回调用该方法的地方。
 * 
 *   finally 语句块里，不管TRY里的代码执行是否出错，都是要执行的。
 */


public class Test021201 {

	public static void main(String[] args) {

		// 异常在fun1()方法里写
		fun1();
		
		try {
			// 异常在调用方法里写
			fun2();
		} catch (Throwable e) {
			System.out.println("main()....Throwable e...");
			e.printStackTrace();
		}
		
		
		// 程序出错时，finally语句块执行
		funErr();
		
		funNormal();

		System.out.println("main().........finish.........");
	}


	private static void funErr() {

		try {
			int a = 0;
			System.out.println(1 / a);
			BufferedReader br = new BufferedReader(
					new InputStreamReader(new FileInputStream(new File("aaa.txt")), "utf-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			// 不管程序执行是否出异常，finally 里的代码是一定会执行。
			System.out.println("funErr()  finally");
		}
		
		System.out.println("funErr() end");

	}
	
	private static void funNormal() {

		try {
			int a = 1;
			System.out.println(1 / a);
		} finally {
			// 不管程序执行是否出异常，finally 里的代码是一定会执行。
			System.out.println("funNormal()  finally");
		}
		
		System.out.println("funNormal() end");

	}
	

	private static void fun1()  {

		File f = new File("aaa.txt");

		BufferedReader br;
		try {
			br = new BufferedReader(
					new InputStreamReader(new FileInputStream(f), "utf-8"));
			String str = br.readLine();

			br.close();
		} catch (UnsupportedEncodingException e) {
			System.out.println("UnsupportedEncodingException e");
			e.printStackTrace();
			
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException e");
			e.printStackTrace();
			
		} catch (IOException e) {
			System.out.println("IOException e");
			e.printStackTrace();
			
		} catch (Exception e) {
			System.out.println("Exception e");
			e.printStackTrace();
		} catch (Throwable e) {
			System.out.println("Throwable e");
			e.printStackTrace();
		}
		
		System.out.println("fun1().........finish.........");
	}
	

	private static void fun2() throws Throwable {

		File f = new File("aaa.txt");

		BufferedReader br;
		br = new BufferedReader(
				new InputStreamReader(new FileInputStream(f), "utf-8"));
		String str = br.readLine();

		br.close();
		
		System.out.println("fun2().........finish.........");
	}
}
