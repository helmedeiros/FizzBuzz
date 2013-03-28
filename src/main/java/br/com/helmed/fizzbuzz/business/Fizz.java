package br.com.helmed.fizzbuzz.business;

/**
 * User: helmed
 * Date: 3/24/13
 * Time: 3:58 PM
 */
public class Fizz extends FizzBuzz {

    private static final int FACTOR = 3;
    private static final String WORD = "Fizz";

    public static String process(int valor) {
        return  processThis(valor, FACTOR, WORD);
    }
}
