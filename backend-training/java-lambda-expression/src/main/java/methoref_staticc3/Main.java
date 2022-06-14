package methoref_staticc3;

public class Main {

    public static void say(){
        System.out.println("say something");
    }

    public static void main(String[] args) {

        //lambda expression
        Talking t = () -> System.out.println("hello");
        t.talk();

        Talking t2 =Main::say;
        t2.talk();

    }
}
