package br.com.helmed.fizzbuzz.business;

import br.com.helmed.fizzbuzz.util.NumberUtil;

/**
 * User: helmed
 * Date: 3/27/13
 * Time: 8:28 PM
 */
public class FizzBuzz {
    public static String process(int valor) {
        final String fizz = Fizz.process(valor);
        final String buzz = Buzz.process(valor);
        return (NumberUtil.isInt(fizz)?"":fizz) + (NumberUtil.isInt(buzz)?"":buzz);
    }

    static String processThis(final int number, final int factor, String word) {
        return number % factor == 0? word : String.valueOf(number);
    }
}
