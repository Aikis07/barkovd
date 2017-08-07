package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    /**.
     * Метод проверяет метод класса Max.
     * @param first - first
     * @param second - second
     */

    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }

    public void whenFirstLessSecondThird() {
        Max maximum = new Max();
        int result = maximum.max(1,2,3);
        assertThat(result, is(3));
    }
}
