
/**
 * Пирамида в консоли.
 *
 * @author Danila Barkov (danila.barkov@gmail.com)
 * @version $Id$
 * @since 0.1
 */

package ru.job4j.loop;

public class Paint {
    public String piramid(int h) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= h; i++){
            for (int j = 1; j <= ((h*2) - 1); j++){
                if (j > (h - i) && j < (h + i)){
                    builder.append("^");
                } else {
                    builder.append(" ");
                }
            }
            builder.append(System.getProperty("line.separator"));
        }
        return builder.toString();
    }
}
