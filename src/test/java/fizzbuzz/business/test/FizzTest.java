package fizzbuzz.business.test;

import static org.junit.Assert.assertEquals;

import br.com.helmed.fizzbuzz.business.Fizz;
import org.junit.Test;

/**
 * User: helmed
 * Date: 3/24/13
 * Time: 3:50 PM
 */
public class FizzTest {

    @Test public void shouldReturnFizzFor3() {
        assertEquals("Fizz", Fizz.process(3));
    }

    @Test public void shouldReturnFizzWithMultiplesOf3() throws Exception {
        for (int i = 0; i < 15; i+=3) {
            assertEquals("Fizz", Fizz.process(i));
        }
    }

    @Test public void shouldReturnTheNumberWhenNotMutipleOf3() throws Exception {
        for (int i = 0; i < 15; i++) {
            if(i%3 != 0)  assertEquals(String.valueOf(i), Fizz.process(i));
        }
    }

    @Test public void shouldReturnFizzBuzzWhenIsMultipleOf3And5() throws Exception {
        assertEquals("Fizz", Fizz.process(15));
    }
}
