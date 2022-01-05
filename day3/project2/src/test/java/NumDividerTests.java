import exception.NumDivider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import exception.BadNumberException;


@DisplayName("Test for complete number")
@Test
public class NumDividerTests
{
    void testCompleteNumbers(){
        var dvDr = new NumDivider();
        var num1 = 10;
        var num2 = 10;
        var expected = 1;
        var actual = dvDr.divideNumbers(num1,num2);
       // Assertions Assertion;
        Assertions.assertEquals(expected, actual);

    }
    @DisplayName("Test for precision point number")
    @Test
    void testsPrecisionNumbers()
    {
        var num1=4.2;
        var num2=2.2;
        var expected=1.9090;
        //NumDivider dvDr;
        var actual = dvDr.divideNumbers(num1, num2);
        Assertions.assertEquals(expected,actual);
    }
    @DisplayName("Test for Unexpected Numbers")
    @Test
    void testUnexpectedNumbers() {
        var num1 = 4.5;
        var num2 = 0;

        var dvDr = new NumDivider();
        var expected = 0;
        var actual = dvDr.divideNumbers(num1, num2);
        Assertions.assertEquals(expected, actual);
    }
    @DisplayName("Testing Exceptions")
    @Test
    void testUnexpectedNumbersWithException() {
        var num1 = 4.5;
        var num2 = 0;

        var ex = Assertions.assertThrows(BadNumberException.class, () -> {
            var dvDr = new NumDivider();
            dvDr.divideNumbersException(num1, num2);
        });

        var expected = "num2 is 0";
        var actual = ex.getMessage();

        Assertions.assertEquals(expected, actual);
    }



}

