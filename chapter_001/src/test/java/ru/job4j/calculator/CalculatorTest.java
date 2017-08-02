package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Danila Barkov (mailto:danila.barkov@gmail.com)
* @version $Id$
* @since 0.1
*/

public class CalculatorTest {
	/**
* Метод проверяет сложение.
*/
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
	/**
	* Метод проверяет вычитание.
	*
	*
	*/
	public void whenAddOneMinusOneThenZero() {
        Calculator calc = new Calculator();
        calc.add2(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
	/**
	* Метод проверяет умножение.
	*
	*
	*/
	public void whenAddOneMultiplyOneThenOne() {
        Calculator calc = new Calculator();
        calc.add3(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
	/**
	* Метод проверяет деление.
	*
	*
	*/
	public void whenAddOneDivideOneThenOne() {
        Calculator calc = new Calculator();
        calc.add4(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
}