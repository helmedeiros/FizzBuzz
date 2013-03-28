package fizzbuzz.business.test;

import br.com.helmed.fizzbuzz.business.Buzz;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * User: helmed
 * Date: 3/24/13
 * Time: 9:41 PM
 */
public class BuzzTest {

    private Buzz buzz;

    @Before
    public void setUp() throws Exception {
        buzz = new Buzz();
    }

    @Test public void shouldReturnBuzzTo5() throws Exception {
        assertEquals("Buzz", buzz.process(5));

    }

    @Test public void shouldReturnBuzzForMultiplesOf5() throws Exception {
        for (int i = 0; i < 15; i+=5) {
            assertEquals("Buzz", buzz.process(5));
        }

    }

    @Test public void shouldReturnNumberWhenNotMultipleOfFive() throws Exception {
        for (int i = 1; i < 15; i++) {
            if(i %5 != 0) assertEquals(String.valueOf(i), buzz.process(i));
        }

    }

}

