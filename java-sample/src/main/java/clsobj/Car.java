package clsobj;

public class Car
{
    public int speed;

    // constructor used to initialize the state at the time of
    // object creation
    //default
    public Car() { speed = 10;  }

    //parameterized
    public Car(int sp) {
        speed = sp;
    }

    public void speedUp() {
        speed += 10;
    }
}
