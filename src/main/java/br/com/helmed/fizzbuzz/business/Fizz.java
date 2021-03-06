package br.com.helmed.fizzbuzz.business;

/**
 * User: helmed
 * Date: 3/24/13
 * Time: 3:58 PM
 */
public class Fizz extends FizzBuzz implements Processor {

    private static final int FACTOR = 3;
    private static final String WORD = "Fizz";

    public String process(int valor) {
        return  processThis(valor, FACTOR, WORD);
    }
}
