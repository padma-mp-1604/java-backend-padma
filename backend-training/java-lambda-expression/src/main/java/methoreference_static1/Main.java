package methoreference_static1;

public class Main {

    public static void view() {
        System.out.println("this is static method");
    }

    public static void main(String[] args) {

        //Method Reference
        StaticRef s2 = () -> System.out.println("hii");
        s2.count();

        //static method ref
        StaticRef s1 = Main::view;
        s1.count();

    }

}
