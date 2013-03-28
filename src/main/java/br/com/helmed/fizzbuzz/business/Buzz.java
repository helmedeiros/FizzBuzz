package br.com.helmed.fizzbuzz.business;

/**
 * User: helmed
 * Date: 3/24/13
 * Time: 9:43 PM
 */
public class Buzz extends FizzBuzz {

    private static final int FACTOR = 5;
    private static final String WORD = "Buzz";

    public static String process(int number) {
        return processThis(number, FACTOR, WORD);
    }

}
