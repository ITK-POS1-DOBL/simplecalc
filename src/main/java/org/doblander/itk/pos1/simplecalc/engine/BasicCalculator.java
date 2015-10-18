/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.doblander.itk.pos1.simplecalc.engine;

/**
 * A very basic implementation of a calculator.
 * 
 * @author intruder
 */
public class BasicCalculator implements ICalculator {

	@Override
	public double add(double[] numbers) {

		// the "0" is the non-change element regarding addition
		double result = 0.0;

		for (int i = 0; i < numbers.length; i++) {
			result = result + numbers[i];
		}
		
		return result;
		
	}

	@Override
	public double sub(double[] numbers) {

		// convention: subtract all following numbers from the first element in the array
		double result = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			result = result - numbers[i];
		}
		
		return result;
		
	}

	@Override
	public double mul(double[] numbers) {

		// the non-change element regarding multiplication is "1"
		double result = 1.0;

		for (int i = 0; i < numbers.length; i++) {
			result = result * numbers[i];
		}

		return result;

	}

	@Override
	public double div(double[] numbers) {

		// initialize to the first number in the array
		double result = numbers[0];

		// convention: first argument is the divident, all following numbers are
		// dividents
		// therefore: start with the second argument in the loop!
		for (int i = 1; i < numbers.length; i++) {
			result = result / numbers[i];
		}

		return result;
		
	}

}
