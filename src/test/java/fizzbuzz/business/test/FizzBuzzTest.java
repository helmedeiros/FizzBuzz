package fizzbuzz.business.test;

import br.com.helmed.fizzbuzz.business.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: helmed
 * Date: 3/27/13
 * Time: 9:20 PM
 */
public class FizzBuzzTest {
    @Test public void shouldREturnFizzBuzzWhenMultipleOf3And5() throws Exception {
        assertEquals("FizzBuzz", FizzBuzz.process(15));
    }

    @Test public void shouldREturnFizzWhenMultipleOf3() throws Exception {
        assertEquals("Fizz", FizzBuzz.process(3));
    }

    @Test public void shouldREturnBuzzzWhenMultipleOf5() throws Exception {
        assertEquals("Buzz", FizzBuzz.process(5));
    }

}
