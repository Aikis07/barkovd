/**
 * Пирамида в консоли.
 *
 * @author Danila Barkov (danila.barkov@gmail.com)
 * @version $Id$
 * @since 0.1
 */

package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {
    @Test
    public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
        Paint paint = new Paint();
        String result = paint.piramid(2);
        String sep = System.getProperty("line.separator");
        String expected = String.format(" ^ %s^^^%s", sep, sep);
        assertThat(result, is(expected));
    }

    @Test
    public void whenPiramidWithHeightThreeThenStringWithThreeRows() {
        Paint paint = new Paint();
        String result = paint.piramid(3);
        String sep = System.getProperty("line.separator");
        String expected = String.format("  ^  %s ^^^ %s^^^^^%s", sep, sep, sep);
        assertThat(result, is(expected));
    }
}

