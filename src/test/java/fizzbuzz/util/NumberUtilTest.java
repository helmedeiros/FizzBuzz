package fizzbuzz.util;

import br.com.helmed.fizzbuzz.util.NumberUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: helmed
 * Date: 3/27/13
 * Time: 9:32 PM
 */
public class NumberUtilTest {

    @Test public void testShouldValidateIntegers() throws Exception {
        for (int i = 0; i < 200; i++) {
          assertEquals(true, NumberUtil.isInt(String.valueOf(i)));
        }
    }

    @Test public void testShouldReturnFalseForStrings() throws Exception {
        assertEquals(false, NumberUtil.isInt("Fizz"));
        assertEquals(false, NumberUtil.isInt("Buzz"));
    }
}
