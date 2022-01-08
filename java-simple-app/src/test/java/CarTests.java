import clsobj.Car;
import org.junit.
public class CarTests
{
    @DisplayName("hello")
    @Test
    void testCarInvalidObject()
    {
        Car car=null;
        Assertions.assertNull(car);
    }
}