package org.doblander.itk.pos1.simplecalc;

import static org.junit.Assert.*;

import org.doblander.itk.pos1.simplecalc.engine.BasicCalculator;
import org.doblander.itk.pos1.simplecalc.engine.ICalculator;
import org.junit.Before;
import org.junit.Test;

public class BasicCalculatorTest {

	private ICalculator calculator;
	
	@Before
	public void setup() {
		calculator = new BasicCalculator();
	}
	
	@Test
	public void testAdd() {
		assertEquals(1.0, calculator.add(new double[]{0.0,1.0}), 0.000001);
		assertEquals(1.0, calculator.add(new double[]{1.0,0.0}), 0.000001);
		assertEquals(5.0, calculator.add(new double[]{2.0,3.0}), 0.000001);
	}

	@Test
	public void testSub() {
		assertEquals(1.0, calculator.add(new double[]{0.0,1.0}), 0.000001);
		assertEquals(1.0, calculator.add(new double[]{1.0,0.0}), 0.000001);
		assertEquals(5.0, calculator.add(new double[]{2.0,3.0}), 0.000001);
	}

	@Test
	public void testMul() {
		assertEquals(0.0, calculator.mul(new double[]{0.0,1.0}), 0.000001);
		assertEquals(0.0, calculator.mul(new double[]{1.0,0.0}), 0.000001);
		assertEquals(6.0, calculator.mul(new double[]{2.0,3.0}), 0.000001);
	}

	@Test
	public void testDiv() {
		assertEquals(0.0, calculator.div(new double[]{0.0,1.0}), 0.000001);
		//assertEquals(NaN, calculator.div(new double[]{1.0,0.0}));
		assertEquals(2.0, calculator.div(new double[]{6.0,3.0}), 0.000001);
	}

}
