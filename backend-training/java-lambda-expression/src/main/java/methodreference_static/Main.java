package methodreference_static;

public class Main {

    public static  void view()
    {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Walking walk1 = Main::view;
        walk1.walk();
    }
}
