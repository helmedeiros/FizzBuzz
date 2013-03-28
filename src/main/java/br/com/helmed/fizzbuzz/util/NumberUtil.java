package br.com.helmed.fizzbuzz.util;

/**
 * User: helmed
 * Date: 3/27/13
 * Time: 9:31 PM
 */
public class NumberUtil {
    public static boolean isInt(final String value) {
        if (value == null) return false;
        int length = value.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        if (value.charAt(0) == '-') {
            if (length == 1) {
                return false;
            }
            i = 1;
        }
        for (; i < length; i++) {
            char c = value.charAt(i);
            if (c <= '/' || c >= ':') {
                return false;
            }
        }
        return true;
    }
}
