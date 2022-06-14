package lambdaexpression3;

public class Main {
    public static void main(String[] args) {
        Sayable s = () ->{
            return "i have to say";
        };
        System.out.println(s.say());
    }
}
