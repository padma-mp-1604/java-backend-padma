package methodreference1;

public class Main {
    public static void main(String[] args) {


        Sayable say1 = MethodReference::saySoomething;
        say1.say();
    }
}
