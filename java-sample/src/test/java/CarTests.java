import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import clsobj.Car;
public class CarTests
{
    @DisplayName("Car Invalid Object")
    @Test
    void testCarInvalidObject() {
        Car car = null;
        Assertions.assertNull(car);
    }

    @DisplayName("Car Valid Object")
    @Test
    void testCarValidObject() {
        Car car = new Car();
        Assertions.assertNotNull(car);
    }

    @DisplayName("Car Speed By Default Constructor")
    @Test
    void testCarSpeedDefault() {
        Car car = new Car();

        int expectedSpeed = 10;
        int actualSpeed = car.speed;

        Assertions.assertEquals(expectedSpeed, actualSpeed);
    }

    @DisplayName("Car Speed By Parameterized Constructor")
    @Test
    void testCarSpeedParameterized() {
        Car car = new Car(100);

        int expectedSpeed = 100;
        int actualSpeed = car.speed;

        Assertions.assertEquals(expectedSpeed, actualSpeed);
    }

    @DisplayName("Check Car Speed ")
    @Test
    void testSpeedUp() {
        Car car = new Car();
        car.speedUp();

        int expectedSpeed = 20;
        int actualSpeed = car.speed;

        Assertions.assertEquals(expectedSpeed, actualSpeed);
    }

    @DisplayName("Check Speed if it negative")
    @Test
    void testSpeedUpNegative() {
        Car car = new Car(-100);
        car.speedUp();

        int expectedSpeed = -90;
        int actualSpeed = car.speed;
        Assertions.assertEquals(expectedSpeed, actualSpeed);
    }
}
