package ru.job4j.calculator;
/**
 * Calculate.
 *
 * @author Danila Barkov (danila.barkov@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Calculator {
	/**
     * Main.
     * @param args - args.
	 * @throws
     */
	private double result;
	/**.
	* Метод выполняет сложение.
	* @param first - first
	* @param second - second
	*/
    public void add(double first, double second) {
        this.result = first + second;
    }
	/**
	* Метод выполняет вычитание.
	* @param first - first
	* @param second - second
	*/
    public void add2(double first, double second) {
        this.result = first - second;
    }
    /**
	* Метод выполняет умножение.
	* @param first - first
	* @param second - second
	*/
    public void add3(double first, double second) {
        this.result = first * second;
    }
    /**
	* Метод выполняет деление.
	* @param first - first
	* @param second - second
	*/
    public void add4(double first, double second) {
        this.result = first / second;
    }
	/**
	* Метод делает то то.
	* @return result
	*
	*/
    public double getResult() {
        return this.result;
    }
}