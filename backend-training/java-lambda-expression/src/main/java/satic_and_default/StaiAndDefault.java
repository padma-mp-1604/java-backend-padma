package satic_and_default;

public interface StaiAndDefault {
    void run();

    static void count(){
       System.out.println("hii");
    }
//
    default void view(){
        System.out.println("hello i am in default but in interface");
    }
}
