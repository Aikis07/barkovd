package ru.job4j.max;

/**
 * When first less second.
 *
 * @author Danila Barkov (danila.barkov@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Max {
    /**.
     * Метод выполняет сравнение двух переменных.
     * @param first - first
     * @param second - second
     */
    public int max(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }
}
