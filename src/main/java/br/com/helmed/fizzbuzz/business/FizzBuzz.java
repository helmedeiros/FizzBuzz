package br.com.helmed.fizzbuzz.business;

import br.com.helmed.fizzbuzz.util.NumberUtil;

/**
 * User: helmed
 * Date: 3/27/13
 * Time: 8:28 PM
 */
public class FizzBuzz implements Processor {
    public String process(int valor) {
        return is(Fizz.class, valor) + is(Buzz.class, valor);
    }

    private <T extends Processor> String is(Class<T> clazz, int valor) {
        String processed;
        try {
            processed = clazz.newInstance().process(valor);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
        return NumberUtil.isInt(processed) ? "" : processed;
    }

    static String processThis(final int number, final int factor, String word) {
        return number % factor == 0? word : String.valueOf(number);
    }
}
