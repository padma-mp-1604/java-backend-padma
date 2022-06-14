package lambdaexpression4;


public class Main {
    public static void main(String[] args) {

        LambdaParameter lam = (name) ->{
            return "hello" + name;
        };
        System.out.println(lam.run("padma"));

    }
}
