package jp.co.yahoo.hw.ym202301.saisk.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class T0226Test {

	@Test
	public void test01() {
		T0226 obj = new T0226();
		assertEquals("良", obj.getLevel(85));
	}
	@Test
	public void test02() {
		T0226 obj = new T0226();
		assertEquals("优", obj.getLevel(95));
	}
	@Test
	public void test03() {
		T0226 obj = new T0226();
		assertEquals("可", obj.getLevel(75));
	}
	@Test
	public void test04() {
		T0226 obj = new T0226();
		assertEquals("及格", obj.getLevel(65));
	}
	@Test
	public void test05() {
		T0226 obj = new T0226();
		assertEquals("不及格", obj.getLevel(12));
	}

}
