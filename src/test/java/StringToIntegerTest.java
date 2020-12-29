import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class StringToIntegerTest
{
    @Test
    public void convertTest_Normal_Input() {
        try {
            assertEquals(1234, StringToInteger.convert("1234"));
            assertEquals(-1234,StringToInteger.convert("-1234"));
        } catch (Exception e) {
            Assert.fail();
        }
    }
    @Test
    public void convertTest_InputWithSpace() {
        try {
            assertEquals(1234, StringToInteger.convert("1 5"));
        } catch (Exception e) {
            Assert.fail();
        }
    }
    @Test
    public void convertTest_InputWithWords() {
        try {
            assertEquals(1234, StringToInteger.convert("a12"));

        } catch (Exception e) {
            Assert.fail();
        }
    }
}
