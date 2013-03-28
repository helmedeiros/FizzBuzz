package fizzbuzz.business.test;

import br.com.helmed.fizzbuzz.business.FizzBuzz;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: helmed
 * Date: 3/27/13
 * Time: 9:20 PM
 */
public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test public void shouldREturnFizzBuzzWhenMultipleOf3And5() throws Exception {
        assertEquals("FizzBuzz", fizzBuzz.process(15));
    }

    @Test public void shouldREturnFizzWhenMultipleOf3() throws Exception {
        assertEquals("Fizz", fizzBuzz.process(3));
    }

    @Test public void shouldREturnBuzzzWhenMultipleOf5() throws Exception {
        assertEquals("Buzz", fizzBuzz.process(5));
    }

}
