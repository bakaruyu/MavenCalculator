package com.solera.sandoval;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MavenCalculatorTest {

	@Test
	public void test1() {
		MavenCalculator mvc = new MavenCalculator();
		Assert.assertEquals(10, mvc.executeAddNumbers(5, 5));
	}
	@Test
	public void test2() {
		MavenCalculator mvc = new MavenCalculator();
		Assert.assertEquals(10, mvc.executeSubstractNumbers(15, 5));
	}

}
