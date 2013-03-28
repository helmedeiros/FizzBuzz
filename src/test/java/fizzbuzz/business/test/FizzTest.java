package fizzbuzz.business.test;

import static org.junit.Assert.assertEquals;

import br.com.helmed.fizzbuzz.business.Fizz;
import org.junit.Before;
import org.junit.Test;

/**
 * User: helmed
 * Date: 3/24/13
 * Time: 3:50 PM
 */
public class FizzTest {

    private Fizz fizz;

    @Before
    public void setUp() throws Exception {
        fizz = new Fizz();
    }

    @Test public void shouldReturnFizzFor3() {
        assertEquals("Fizz", fizz.process(3));
    }

    @Test public void shouldReturnFizzWithMultiplesOf3() throws Exception {
        for (int i = 0; i < 15; i+=3) {
            assertEquals("Fizz", fizz.process(i));
        }
    }

    @Test public void shouldReturnTheNumberWhenNotMutipleOf3() throws Exception {
        for (int i = 0; i < 15; i++) {
            if(i%3 != 0)  assertEquals(String.valueOf(i), fizz.process(i));
        }
    }

    @Test public void shouldReturnFizzBuzzWhenIsMultipleOf3And5() throws Exception {
        assertEquals("Fizz", fizz.process(15));
    }
}
