package methodreference_instance;

public class InstanceMethod {

    public void view(){
        System.out.println("instance method");
    }

    public static void main(String[] args) {
        InstanceMethod instanceMethod = new InstanceMethod();

        Walking walk1 = instanceMethod::view;
        walk1.walk();
    }
}
