package satic_and_default;

public class Demo implements StaiAndDefault{


    @Override
    public void run() {
        System.out.println("hey !!!!");
    }

//    @Override
//    static void count(){
//        System.out.println("hii");
//    }


    @Override
    public void view() {
        StaiAndDefault.super.view();
        //System.out.println("hey i am in default but in demp class");
    }
}
