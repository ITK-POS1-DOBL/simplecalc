/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.doblander.itk.pos1.simplecalc.engine;

/**
 * Abstraction of a simple calculator.
 * 
 * @author intruder
 */
public interface ICalculator {
    
	/**
	 * add all numbers in the given array
	 * @param numbers an array of double as input
	 * @return the product of all numbers input in the array parameter
	 */
	public double add(double[] numbers);
	
	/**
	 * take the first number in the array parameter and subtract all other numbers in the array from it
	 * @param numbers a double array parameter
	 * @return the difference of the first element of the array and the sum of all the remaining elements
	 */
	public double sub(double[] numbers);
	
	/**
	 * multiply all elements of the given array parameter
	 * @param numbers an array of double to be multiplied
	 * @return the product of all elements in the given array
	 */
	public double mul(double[] numbers);
	
	/**
	 * take the first element in the array and divide it by all the remaining elements
	 * @param numbers input array of double
	 * @return the fraction of the first element in the array divided by all the remaining array elements
	 */
	public double div(double[] numbers);
	
}
