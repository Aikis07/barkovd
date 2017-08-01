package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
* Test.
*
* @author Danila Barkov (mailto:danila.barkov@gmail.com)
* @version $Id$
* @since 0.1
*/

public class CalculatorTest {
	/**
* Test add.
*/
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
	public void whenAddOneMinusOneThenZero() {
        Calculator calc = new Calculator();
        calc.add2(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
	public void whenAddOneMultiplyOneThenOne() {
        Calculator calc = new Calculator();
        calc.add3(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
	public void whenAddOneDivideOneThenOne() {
        Calculator calc = new Calculator();
        calc.add4(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
}