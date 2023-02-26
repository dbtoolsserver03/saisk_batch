package jp.co.yahoo.hw.ym202301.saisk.test;

import org.junit.Assert;
import org.junit.Test;

public class MyAnswerTest {

	@Test
	public void testok1() {
		
		Assert.assertEquals(true,MyAnswer.isSymmetry("abccba"));
		
	}
	
	@Test
	public void testok2() {
		
		Assert.assertEquals(true,MyAnswer.isSymmetry("abc555cba"));
		
	}

	@Test
	public void testerr01() {
		
		Assert.assertEquals(false,MyAnswer.isSymmetry("abc566cba"));
		
	}
}
